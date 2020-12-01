package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성
	 public void service(String state) {
		 if (state.equals("오후")) { //문자열의 같다(==) 는 equals()를 사용합니다.
			 afternoon();
	        } else {
	        	super.service(state);
	        }
	 }

	    public void day() {
	        System.out.println("낮에는 열심히 수업을 듣자");
	    }
	    public void afternoon() {
	        System.out.println("오후에도 낮과 마찬가지로 공부를 해야 합니다.");
	    }
}
