package bison;

import static java.lang.String.format;
import static java.net.InetAddress.getLocalHost;

import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/where")
	String hello() throws UnknownHostException {
		return format("Bison bank on [%s]", getLocalHost().getHostName());
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
