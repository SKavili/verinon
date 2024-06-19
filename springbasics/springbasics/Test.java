package com.springbasics.springbasics;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        
        //ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        
        Student student = (Student) context.getBean("s");
        student.displayInfo();
		context.close();
    }
}
