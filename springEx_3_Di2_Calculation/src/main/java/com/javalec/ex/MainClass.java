package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		myInfo.getInfo();
		//자원을 사용했으면, 해제를 해주는 습관을 들여야 한다. 
		// 좀 의문이다. java인데 가비지 컬렉터가 돌면서 알아서 해주지 않나?
		ctx.close();

	}

}
