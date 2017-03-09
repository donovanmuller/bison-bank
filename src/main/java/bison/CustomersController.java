package bison;

import java.net.UnknownHostException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomersController {

	private JdbcTemplate jdbcTemplate;

	public CustomersController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@GetMapping
	String customers(Model model) throws UnknownHostException {
		model.addAttribute("customers",
				jdbcTemplate.query("SELECT * FROM Customers",
						(resultSet, i) -> new Customer(resultSet.getString(1),
								resultSet.getString(2))));
		return "customers";
	}
}
