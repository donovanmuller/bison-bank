package bison;

import static java.lang.String.format;
import static java.net.InetAddress.getLocalHost;

import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhereContoller {

	@GetMapping("/where")
	String hello() throws UnknownHostException {
		return format("Bison bank on [%s]", getLocalHost().getHostName());
	}
}
