package ir.callmera.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneratorApplication.class, args);
	}

	@GetMapping("/generate")
	public Integer start() {
		int min = 1;
		int max = 100;
		int random = (int)(Math.random()*(max-min+1)+min);
		System.out.println("The generated number is: " + random);
		return random;
	}

}
