package org.koreait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Makeup01Application {

	public static void main(String[] args) {
		SpringApplication.run(Makeup01Application.class, args);
	}

}
