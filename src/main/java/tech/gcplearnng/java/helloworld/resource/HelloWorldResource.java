package tech.gcplearnng.java.helloworld.resource;

import java.net.Inet4Address;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

	@GetMapping("/")
	public String hello() throws UnknownHostException {
		return "Hello GCP Learnng from :" + Inet4Address.getLocalHost().getHostAddress() + " host:" + Inet4Address.getLocalHost().getHostName();
	}
}
