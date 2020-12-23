package com.ComputerCourse;

import java.util.Arrays;

public class MathCourse {
	
	public static void primeNoseries(int val ){
		int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 1; i <= val; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println(primeNumbers);
	}
	
	
	public static void main(String[] args) {
     
		primeNoseries(10);
		fibonacciNumbers(10);
		sortArray();
		
	}


	private static void sortArray() {
		int[] arr = {13, 7, 6, 45, 4, 9, 14, 55};
		 
        Arrays.sort(arr);	
        System.out.println(Arrays.toString(arr));
	}


	private static void fibonacciNumbers(int n) {
		 int f1 = 0, f2 = 1, i;
		 
	        if (n < 1)
	            return;
	        System.out.print(f1 + " ");
	        for (i = 1; i < n; i++) 
	        {
	            System.out.print(f2 + " ");
	            int next = f1 + f2;
	            f1 = f2;
	            f2 = next;
	        }
	}

}
