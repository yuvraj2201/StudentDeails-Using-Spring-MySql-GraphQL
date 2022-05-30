package com.graphQL.services.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"queryResolver","com.graphQL.service"})
@EntityScan("com.graphQL.entity")
@EnableJpaRepositories("com.graphQL.repository")
public class GraphQLWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQLWithSpringBootApplication.class, args);
	}

}
