package com.javaex.ex01;

public class Customer extends Person{
	private int cNo;
	private int Point;
	public Customer(String name,String hp, int cNo, int point) {
		super(name,hp);
		this.cNo = cNo;
		Point = point;
	}
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint() {
		return Point;
	}
	public void setPoint(int point) {
		Point = point;
	}
	public void showInfo() {
		System.out.println("#이름:"+getName()+"  #핸드폰:"+getHp()+" #고객번호:"+cNo+" #포인트점수"+Point);
	}
}
