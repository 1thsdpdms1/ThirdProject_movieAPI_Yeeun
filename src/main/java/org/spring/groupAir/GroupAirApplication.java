package org.spring.groupAir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GroupAirApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupAirApplication.class, args);
	}

}
