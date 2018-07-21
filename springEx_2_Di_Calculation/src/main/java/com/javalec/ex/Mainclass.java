package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//di 특징 :xml 파일 불러 와서 객체 생성 하기
		
		//path
		String configLocation = "classpath:applicationCTX.xml";
		
		//xml 파싱 : 방금 만든 xml을 파싱해 온다. 
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator  myCalculator =ctx.getBean("myCalculator", MyCalculator.class);
		
		//만든 객체로 메소드를 이용 한다. 
		myCalculator.add();
		myCalculator.sub();
		myCalculator.multi();
		myCalculator.div();
		
	}

}
