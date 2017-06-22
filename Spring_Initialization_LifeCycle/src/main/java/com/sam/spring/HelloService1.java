package com.sam.spring;

public class HelloService1 {
private String name;
	
	public HelloService1() {
		//here we can do Initialization 
		//invoked before the bean the properties are set
	}
	
	public void init(){
		System.out.println("HelloService(initialize method): Using the default-init method in beans.xml we informs the spring container to find initialize method in bean\n"
				+ "This method is invoked as soon as initializing the bean and setting properties \n"+ name+"\n");
	}
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

}
