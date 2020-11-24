package com.expense.youtube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.expense.controller"})
public class ExpenseTrackerYoutubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerYoutubeApplication.class, args);
	}
}