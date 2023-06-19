package com.springcored;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**sssssssss
 * Hello world!
 *
 */
public class App 
{
   

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      ApplicationContext  context = new ClassPathXmlApplicationContext("springcong.xml");
      Student student=(Student) context.getBean("student");
       Student student2=(Student) context.getBean("student2");
       System.out.println(student);
       System.out.println(student2);
       
       
    }
}
