package ru.ruhlov.fm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestSpring {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Test test = context.getBean("test",Test.class);
		
		test.getString();
		context.close();
	}
}
