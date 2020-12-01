package com.javaex.ex05;

public class Depart extends Employee{

	 //코드작성
	private String division;

	public Depart(String name,Integer salary, String division) {
		super(name,salary);
		this.division = division;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	public void showInformation() {
		System.out.println("이름:"+getName()+"  연봉:"+getSalary()+" 부서:"+division);
	}
	
	

}
