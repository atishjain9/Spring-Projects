package in.atish.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		//Starting IOC Container
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
		System.out.println("-------------------------------------");
		//Car car=context.getBean(Car.class);
		
		//car.drive();
		
	}

}