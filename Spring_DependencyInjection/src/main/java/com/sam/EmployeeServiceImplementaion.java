package com.sam;

import com.sam.DAO.EmployeeDAOImp;

public class EmployeeServiceImplementaion implements EmployeeService{
	
	private EmployeeDAOImp employeedao;
	
	public void setEmployeeDAO(EmployeeDAOImp e){
		this.employeedao = e;
	}

	public boolean incrementSalary(int empno, double amount) {
	
		double sal = employeedao.getSal(empno);
		sal+=amount;
		employeedao.setSal(empno, sal);
		
		return true;
	}

	public double getSalary() {
		return employeedao.getSal(1);
	}

}
