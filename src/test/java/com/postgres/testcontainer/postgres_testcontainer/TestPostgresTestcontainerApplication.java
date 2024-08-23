package com.postgres.testcontainer.postgres_testcontainer;

import org.springframework.boot.SpringApplication;

public class TestPostgresTestcontainerApplication {

	public static void main(String[] args) {
		SpringApplication.from(PostgresTestContainerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
