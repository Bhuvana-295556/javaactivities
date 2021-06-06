package test;

import java.io.*;
import java.util.Scanner;


public class TestMatch extends Match{

	public int runs,balls;
	final int TEST_MAX = 90;
	
	Scanner sc = new Scanner(System.in);


	int calculateBalls() {
    	
    	balls = (int) (TEST_MAX - currentover);
    	runs = target - currentscore;
    	
    	return balls;
		
	}
      float calculateRunRate() {
    	  
    	  runRate=runs/balls;
          
    	  System.out.println("Need "+runs+" runs in "+balls+ balls);
    	  System.out.println("Required Run Rate: "+runRate);
		  
          return runRate;
	}
	
    
	
       void getInput() {
		
		System.out.println("Enter current score: ");
 	    this.currentscore = sc.nextInt();
        
 	    System.out.println("Enter current over: ");
        this.currentover = sc.nextInt();
        
        System.out.println("Enter Target Score");
        this.target = sc.nextInt();
		
	}
}
