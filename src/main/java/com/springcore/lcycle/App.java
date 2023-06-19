package com.springcore.lcycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		
		  AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lcycle/springcong.xml");
		  context.registerShutdownHook();
	    Parle p1=(Parle) context.getBean("p1");
		 System.out.println(p1);
		
		  System.out.println("------------------");
		 Coffee c1=(Coffee) context.getBean("c1");
		  System.out.println(c1);
		//  Example e1=(Example) context.getBean("e1");
		//	 System.out.println(e1);
	}

}
