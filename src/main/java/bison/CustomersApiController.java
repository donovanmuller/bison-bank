package bison;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomersApiController {

	private JdbcTemplate jdbcTemplate;

	public CustomersApiController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@PostMapping
	void customer(@RequestBody Customer customer) {
		jdbcTemplate.update("INSERT INTO Customers (firstName, surname) VALUES (?, ?)",
				customer.getName(), customer.getSurname());
	}

	@GetMapping
	List<String> customers() {
		return jdbcTemplate.query("SELECT * FROM Customers", (resultSet, i) -> String
				.format("%s %s", resultSet.getString(1), resultSet.getString(2)));
	}
}
