package com.ryan.shapes;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ShapesApplication {

	public static void main(String[] args) {
		AbstractApplicationContext content = new ClassPathXmlApplicationContext("spring.xml");
		content.registerShutdownHook();
		
//		Shape shape = (Shape) content.getBean("triangle1");
//		shape.draw();
		
		Shape shape = (Shape) content.getBean("circle");
		shape.draw();
	}
}
