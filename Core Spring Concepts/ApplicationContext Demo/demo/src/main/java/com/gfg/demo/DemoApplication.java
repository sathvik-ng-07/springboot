package com.gfg.demo;

import com.gfg.demo.config.AppConfig;
import com.gfg.demo.domain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main class representing the entry point of the Spring Boot application.
 */
public class DemoApplication {

	/**
	 * Main method to start the Spring Boot application.
	 *
	 * @param args Command-line arguments passed to the application.
	 */
	public static void main(String[] args) {

		// Uncomment the line below if you want to use Spring Boot's default application context
//		 SpringApplication.run(DemoApplication.class, args);

		// Creating an application context using the AppConfig configuration class
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieving a 'Student' bean from the context
		Student student = context.getBean(Student.class);

		// Print and display the details of the 'Student' bean
		System.out.println(student);
	}
}

