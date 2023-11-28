package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=volga&stringtype=unspecified";
		String username = "ni";
		String password = "ni";
		try (Connection connection =
					 DriverManager.getConnection(
							 url, username, password);
			 Statement statement = connection.createStatement();
			 ResultSet resultSet = statement.executeQuery("select 'hello' ")) {
			if (resultSet.next()) {
				return "UP";
			} else {
				return "Down";
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return "Error";
		}
	}



}
