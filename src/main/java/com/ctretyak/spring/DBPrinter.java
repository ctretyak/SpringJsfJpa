package com.ctretyak.spring;

import com.ctretyak.hibernate.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ctretyak on 13.03.2016.
 */
@Component
public class DBPrinter {

	@Autowired
	private DataSource dataSource;

	@PostConstruct
	public void postConstruct() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.query("SELECT * FROM messages", new RowMapper<Message>() {
			@Override
			public Message mapRow(ResultSet resultSet, int i) throws SQLException {
				Message message = new Message();
				message.setText(resultSet.getString("message_text"));

				return message;
			}
		}).forEach(m -> System.out.println(m.toString()));

	}
}
