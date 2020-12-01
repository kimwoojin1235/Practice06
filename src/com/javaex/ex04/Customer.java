package com.javaex.ex04;

public class Customer extends User{
	private int point;

	public Customer(String id, String password,String name, int point) {
		super(id, password, name);
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	public void showinfo() {
		System.out.println("아이디:"+getId()+" 패스워드:"+getPassword()+" 이름:"+getName()+" 포인트:"+point);
	}
}
