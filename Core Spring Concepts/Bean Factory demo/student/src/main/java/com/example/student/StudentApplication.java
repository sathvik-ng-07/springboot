package com.example.student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Application class
@SpringBootApplication

// Main class
public class StudentApplication {

	// Main driver method
	public static void main(String[] args) {

		// Creating object in a spring container (Beans)
		BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
		Student student = (Student) factory.getBean("student");

		System.out.println(student);
	}
}
