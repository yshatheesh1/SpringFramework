package com.sam.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sam.EmployeeService;

public class EmpImp {

	public static void main(String[] args) {


		ApplicationContext ct = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService es = (EmployeeService) ct.getBean("emp_service");
		System.out.println("Salary:" + es.getSalary());
		es.incrementSalary(1, 200);
		System.out.println("After Incrementing: "+es.getSalary());

	}

}
