package test;

import java.util.Scanner;

public class test{
	
   public static void main(String[] args){
	   
	   Scanner sc = new Scanner(System.in);
			  
	   System.out.println("Enter the Shape");
	   
	   String shape = sc.nextLine();
	   
	   int radius,length;
	   

	   if(shape == "Circle") {
		   
		   System.out.println("Enter the Radius");
		   
		   radius = sc.nextInt();
		   
		   Shape c = new Circle(radius);
		   
		   System.out.println("Circle Area is " + c.calculateArea());
		   
		   }
	   
	   else {
		   
		   System.out.println("Enter the dimensions");
		
		   length = sc.nextInt();
		
		   Shape s = new Square(length);

		   System.out.println("Square Area is " + s.calculateArea());
	   }
	   

	   
  }
}
 package test;

abstract public class Shape {
	
	   // Private member variable
	   protected int value;
	   
	
	   
	  abstract public double calculateArea();
	}

 package test;

public class Circle extends Shape{
	
	   // private instance variables
	   private double radius;

	
	   public Circle(double radius) {
	      this.radius = radius;
	      System.out.println("Construced a Circle with Circle(radius)");  // for debugging
	   }
	  
	   // public getters and setters for the private variables
	   public double getRadius() {
	      return this.radius;
	   }
	   
	   public void setRadius(double radius) {
	      this.radius = radius;
	   }
	  

	 
 public double calculateArea() {
	
	 return radius * radius * Math.PI;
		
	}

}
[9:05 PM, 6/5/2021] Yashaswini LT: Square.java
[9:05 PM, 6/5/2021] Yashaswini LT: package test;

public class Square extends Shape{
	
	private int l;
	
	public Square(int l) {
		
		this.l = l;
		
		
	}
	
	//setter
	
	public void setDimensions(int l) {
		
		this.l = l;

	  
	}
	  
	//getter
	
	public int getLength() {
		
		return this.l;
	}

	public double calculateArea() {
		
		 return l*l;
			
		}

}
