package com.sam.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloService implements InitializingBean,DisposableBean{
	
	private String name;
	
	public HelloService() {
		//here we can do Initialization 
		//invoked before the bean the properties are set
	}
	
	

	public void afterPropertiesSet() throws Exception {
		// invoked after the bean properties are set
		System.out.println("HelloService(initialize method): In Spring, InitializingBean and DisposableBean are two marker interfaces,"
				+ " a useful way for Spring to perform certain actions upon bean initialization "
				+ "and destruction.\n"+ this.name+"\n");
	}
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}




	public void destroy() throws Exception {
		 System.out.println("Spring Container is destroy! Customer clean up");
		
	}

}
