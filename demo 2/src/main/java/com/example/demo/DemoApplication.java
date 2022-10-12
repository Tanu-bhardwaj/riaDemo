package com.example.demo;

import com.example.demo.Model.TutorialEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception{
		String sql ="select * from test";
		List<TutorialEntity>result=jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(TutorialEntity.class));
		for (TutorialEntity book :result ) {
			System.out.println(book);
		}
		System.out.println("The size of the table "+"= " + result.size());

	}
}
