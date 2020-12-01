package com.javaex.ex03;

public class Shape {
	protected String fillColor;
	protected String lineColor;
	
	public Shape() {
		super();
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillcolor) {
		this.fillColor = fillcolor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String linecolor) {
		this.lineColor = linecolor;
	}	
}

