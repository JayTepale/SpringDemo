
package com.springcored.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context = new ClassPathXmlApplicationContext("com/springcored/collection/springcong.xml");
		  Emp emp1=(Emp) context.getBean("emp");
		  System.out.println(emp1.getEmpName());
		  System.out.println(emp1.getEmpPhones());
		  System.out.println(emp1.getEmpAddress());

		  System.out.println(emp1.getCourses());


		  
	}

}
