package com.greens;

public class Ride extends Over{
	
	
	   
	   @Override
	public void toys() {
		   
		 // System.out.println("toys shop open"); 
		   
		   
		super.toys();
		
	}
	  
	   
	   @Override
	public void toys(int a) {

		   int a1= 60+a;
		   System.out.println(a1);
		   
		   super.toys(a);
	}
	   
	   
	@Override
	public void toys(String a) {
		
		System.out.println("new section added"+ ", " +a);
		
		//super.toys(a);
	}
	   
	
	
	public static void main(String[] args) {
		
		
		Ride r= new Ride();
		r.toys();
		r.toys(30);
		r.toys("CRFGT");
		
		
		
		
		
		
		
		
	}

}
