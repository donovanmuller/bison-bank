package bison;

import static java.net.InetAddress.getLocalHost;

import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Application {

	@GetMapping("/")
	String index(Model model) throws UnknownHostException {
		model.addAttribute("host", getLocalHost().getHostName());
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
