package test;

import java.io.*;

import java.util.*;

public class test{

	
	    public static void main(String[] args){
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	        System.out.println("Enter the match format");
	    	
	        float b,r;
	    	int choice = sc.nextInt();
	    	
	    	switch(choice){
	    	
	    	case 1: Match O = new ODIMatch();
	    	        O.getInput();
	    	        b =  O.calculateBalls();
	    	        r =  O.calculateRunRate();
	    	        break;
	    	case 2: Match TT = new T20Match();
	    	        TT.getInput();
	                b =  TT.calculateBalls();
	                r =  TT.calculateRunRate();
	    		    break;
	    	case 3: Match T = new TestMatch();
	    	        T.getInput();
	                b =  T.calculateBalls();
	                r =  T.calculateRunRate();
	    		    break;
	    		
	    	default: System.out.println("ERROR in choice");
	    	         System.exit(0);
	    	
	    	}
	  
	}
}
