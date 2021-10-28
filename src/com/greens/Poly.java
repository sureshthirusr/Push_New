package com.greens;

public class Poly {
	
	       public  void employee() {   //empty parameter

	    	   System.out.println("Today's class is JAVA");
	    	     	   
		}	
	       public  void employee(int a) {
	    	   
	    	   int a1=a+a;
	    	   System.out.println("Addition of 2 numbers:" + a1);
          	    	   
			}
	
	       public  void employee(int b, int c, int d) {

		    	  int mult=c*c;
	    	   System.out.println(mult);
				}
		
	       public  void employee(int a, String b) {

		    	System.out.println("course is java:" +a + "," +b);
	    	   
			}

	       public  void employee(String a, int b) {

		    	System.out.println("selenium is  a course:"+ " " +b +","+a);
	    	   
			}
		public static void main(String[] args) {
			
       Poly p= new Poly();
       p.employee();
       p.employee(7);
       p.employee(7, 5, 3);
       p.employee(7, "JAVA");
	   p.employee("Selenium",7485369);
	   p.employee(7485369);
	   p.employee(89);
	   p.employee(75);
		
		}
	


}
	
	
	
		
		
		
		 
	


