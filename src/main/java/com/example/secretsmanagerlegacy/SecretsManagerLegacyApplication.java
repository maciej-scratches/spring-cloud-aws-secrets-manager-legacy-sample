package com.example.secretsmanagerlegacy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecretsManagerLegacyApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SecretsManagerLegacyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SecretsManagerLegacyApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(@Value("${password}") String password) {
		return args -> {
			LOGGER.info("`password` loaded from the AWS Secret Manager: {}", password);
		};
	}
}
