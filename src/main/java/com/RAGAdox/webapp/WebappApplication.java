package com.RAGAdox.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;

@SpringBootApplication
public class WebappApplication {



	public static void main(String[] args) {

		SpringApplication.run(WebappApplication.class, args);

	}


}
