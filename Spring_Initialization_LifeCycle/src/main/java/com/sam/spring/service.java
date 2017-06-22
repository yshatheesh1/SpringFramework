package com.sam.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class service {

	public static void main(String []args){
		ApplicationContext ct = new ClassPathXmlApplicationContext("Bean.xml");
		HelloService usingInterface = (HelloService) ct.getBean("hello");
		HelloService1 usingDefaultInit = (HelloService1) ct.getBean("hello1");
		//System.out.println(usingInterface.getName());
		//System.out.println(usingDefaultInit.getName());
	}
}
