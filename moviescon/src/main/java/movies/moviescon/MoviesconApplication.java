package movies.moviescon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MoviesconApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesconApplication.class, args);
	}

}
