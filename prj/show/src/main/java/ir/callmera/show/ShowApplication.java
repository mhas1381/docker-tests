package ir.callmera.show;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowApplication.class, args);
	}

	@GetMapping("/show/{number}")
	public Integer show(@PathVariable int number) {
		String url = Constants.multiplePath + "/" + number;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders httpHeaders = new HttpHeaders();
		HttpEntity entity = new HttpEntity<>(null, httpHeaders);
		Integer response = restTemplate.exchange(url, HttpMethod.GET, entity, Integer.class).getBody();
		System.out.println("Response from multiple API is: " + response);
		return response;
	}

}
