package com.sam.HelloWorld.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sam.HelloWorld.HelloWorld;

public class HelloWorldService {
	public static void main(String []args){
		ApplicationContext ct = new ClassPathXmlApplicationContext("Beans.xml");
		//we are getting object ct using beans.xml configuration id
		HelloWorld hs = (HelloWorld)ct.getBean("hello");
		
		System.out.println(hs.getName());
	}
}
