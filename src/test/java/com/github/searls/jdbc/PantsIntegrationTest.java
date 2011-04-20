package com.github.searls.jdbc;


import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/test-context.xml")
public class PantsIntegrationTest {

	@Autowired private DataSource dataSource;
	private SimpleJdbcTemplate simpleJdbcTemplate;
	
	@Before
	public void createTemplate() {
		new JdbcTemplate(dataSource).execute("create table pets ( name VARCHAR(255) )");
		simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}
	

	@Test
	public void shouldPullOutWhatYouGiveIt(){
		String expectedName = "Pedro";
		simpleJdbcTemplate.update("insert into pets (name) values ('"+expectedName+"')");		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("name",expectedName);
	
		List<Map<String, Object>> results = simpleJdbcTemplate.queryForList("select * from pets where name = :name", params);
		
		assertThat(results.size(),is(1));
	}
	
}
