package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
    	 if("앱".equals(str)){
             App();
         }else{
             super.execute(str);
         }
    }
	  protected void App(){
        System.out.println("앱재생");
    }
	 protected void playMusic(){
	        System.out.println("다운로드해서 음악재생");
	}

    
    
    
}
