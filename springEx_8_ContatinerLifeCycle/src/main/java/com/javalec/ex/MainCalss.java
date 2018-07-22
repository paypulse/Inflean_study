package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCalss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//container 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX.xml"); //contatiner 설정
		//반드시 refresh 메소드를 호출을 해야 설정이 완료가 될수 있게 해준다. 
		ctx.refresh();
		
		//container 사용
		Student student = ctx.getBean("student", Student.class);
		System.out.println("이름 :" + student.getName());
		System.out.println("나이 :" + student.getAge());
		
		//container 종료 
		ctx.close();

	}

}
