package dev.antoalex.spotifyclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpotifycloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifycloneApplication.class, args);
	}

}
