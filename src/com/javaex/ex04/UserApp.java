package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User[] c01=new User[3];
		Employee e01=new Employee(5000000);
		User u01=new Customer("jws", "j1234", "정우성", 1000);
		User u02=new Customer("yis", "y1234", "이효리", 2000);
		User u03=new Employee("master", "m1234", "운영자", 5000000);
		c01[0]=u01;
		c01[1]=u02;
		c01[2]=u03;
		for (int i = 0; i < c01.length; i++) {
			c01[i].showinfo();
		}
		e01.in();
	}

}
