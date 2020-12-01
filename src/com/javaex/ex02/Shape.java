package com.javaex.ex02;

public class Shape {
	
	private String fillcolor;
	private String linecolor;
	public Shape() {
		System.out.println("생성자 shape(0)실행");
	}
	public Shape(String fillcolor, String linecolor) {
		this.fillcolor = fillcolor;
		this.linecolor = linecolor;
		System.out.println("생성자 shape(2)실행");
	}
	
	

}

