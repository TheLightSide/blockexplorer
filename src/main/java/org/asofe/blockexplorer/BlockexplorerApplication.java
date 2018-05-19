package org.asofe.blockexplorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "org.asofe.blockexplorer")
@EnableJpaRepositories("org.asofe.blockexplorer.dao")
@EnableAutoConfiguration
@EnableScheduling
public class BlockexplorerApplication {

	public static void main(String[] args) {
	    SpringApplication.run(BlockexplorerApplication.class, args);
	}
}
