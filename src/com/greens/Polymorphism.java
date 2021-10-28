package com.greens;

public class Polymorphism {
	
	
	
	
	public void employee() {  //empty parameter

		System.out.println("Today's class is Polymorphism");
	
	}
	
		
	public void employee(int a) {
		
		int a1 =a*a;
		System.out.println("Addition of 2 numbers:" +a1);
		
			
	}
	
	public void employee(int b, int c, int d) {
		
		
	}
	
	public void employee(int b, String c) {
		
		System.out.println("course is java: " +c +","+b);
	}
   
	
	public void employee(String c, int d) {
		
		
		System.out.println("course is java: " +c +","+d);
	}
	
	
	
	public static void main(String[] args) {
		
	 Polymorphism p= new Polymorphism();
	 p.employee();
	 p.employee(7);
	 p.employee(7, "Java");
	 p.employee("JAVA", 10);
	 p.employee(7, 5, 2);
	 p.employee();
	 p.employee(10000000);
	p.employee(89);
		
	}

}
