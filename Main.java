package com.springframework.applicationcontext.settertype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Student student = (Student) applicationContext.getBean("Huzefa");

		System.out.println("Student Data is >>> " + student);
	}

}
