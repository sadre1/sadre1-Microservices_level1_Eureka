package Movie.Info.Service.microserviceMovieInfoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroserviceMovieInfoServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(MicroserviceMovieInfoServiceApplication.class, args);
	}

}
