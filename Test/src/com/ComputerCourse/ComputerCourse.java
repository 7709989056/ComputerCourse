package com.ComputerCourse;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ComputerCourse {

	public static void main(String[] args) {
      File f = new File("src/Temp.txt");
      Boolean arr[] =  new Boolean[5]; 
      int i=0;
      boolean isBalanced = false;
      try (Scanner sc = new Scanner(f)) {
          while (sc.hasNextLine()){
              String expr = sc.nextLine();
              if (BalacedExp(expr)) 
            	  isBalanced = true;
              else
            	  isBalanced = false;
              arr[i]= isBalanced;
              System.out.println(arr[i]);
              i++;
             } 
          }
      catch (IOException e) {
          e.printStackTrace();
      }
	}

	private static boolean BalacedExp(String expr) {
		  Deque<Character> stack 
          = new ArrayDeque<Character>(); 

      for (int i = 0; i < expr.length(); i++)  
      { 
          char x = expr.charAt(i); 

          if (x == '(' || x == '[' || x == '{')  
          { 
              stack.push(x); 
              continue; 
          } 
          if (stack.isEmpty()) 
              return false; 
          char check; 
          switch (x) { 
          case ')': 
              check = stack.pop(); 
              if (check == '{' || check == '[') 
                  return false; 
              break; 

          case '}': 
              check = stack.pop(); 
              if (check == '(' || check == '[') 
                  return false; 
              break; 

          case ']': 
              check = stack.pop(); 
              if (check == '(' || check == '{') 
                  return false; 
              break; 
          } 
      } 

      return (stack.isEmpty()); 
	}

}
