package test;


abstract public class Match {
	
	//Data members
	protected int currentscore;
	protected float currentover;
	protected int target;
    protected float runRate;
    public static  int choice;
    
    

	//methods
	
	abstract float calculateRunRate();
    abstract int calculateBalls();
	abstract void getInput();
	
}
package test;

import java.io.*;
import java.util.Scanner;

public class ODIMatch extends Match {
	
	public int runs,balls;
	final int ODI_MAX = 50;
	
	Scanner sc = new Scanner(System.in);
	
       void getInput() {
		
		System.out.println("Enter current score: ");
 	    this.currentscore = sc.nextInt();
        
 	    System.out.println("Enter current over: ");
        this.currentover = sc.nextInt();
        
        System.out.println("Enter Target Score");
        this.target = sc.nextInt();
		
	}
	
	int calculateBalls() {
    	
    	balls = (int) (ODI_MAX - currentover);
    	runs = target - currentscore;
    	
    	return balls;
		
	}
      float calculateRunRate() {
    	  
    	  runRate=runs/balls;
          
    	  System.out.println("Need "+runs+" runs in "+balls+ balls);
    	  System.out.println("Required Run Rate: "+runRate);
		  
          return runRate;
	}
	
       
}
