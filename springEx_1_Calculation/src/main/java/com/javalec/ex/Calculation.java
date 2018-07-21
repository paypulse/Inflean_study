package com.javalec.ex;

public class Calculation {
	private int firstNum;
	private int secondNum;
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	
	//Sum Method
	public void add(){
		System.out.println("add()");
		System.out.println(firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
	}
	
	//substract method
	public void sub(){
		System.out.println("sub()");
		System.out.println(firstNum + "-" + secondNum + "=" + (firstNum - secondNum));
	}
	
	//multiply method
	public void mult(){
		System.out.println("mul()");
		System.out.println(firstNum + "*" + secondNum + "=" + (firstNum * secondNum));
	}
	
	//divide method
	public void div(){
		System.out.println("div()");
		System.out.println(firstNum + "/" + secondNum + "=" + (firstNum / secondNum));
	}
	
}
