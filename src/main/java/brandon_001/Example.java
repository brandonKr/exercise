package brandon_001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/test")
	String home() {
		return "Hello world";
	}
	
	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		SpringApplication.run(Example.class, args);

	}

}
