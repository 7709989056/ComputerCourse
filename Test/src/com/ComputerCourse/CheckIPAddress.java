package com.ComputerCourse;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CheckIPAddress {
	  static String pattern;
	public static void main(String[] args) {
      File f = new File("src/regularExFile.txt");
      Boolean arr[] =  new Boolean[10]; 
      int i=0;
      String rgx ="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	  pattern = rgx + "." + rgx + "." + rgx + "." + rgx;
	  
      boolean regextMatch = false;
      try (Scanner sc = new Scanner(f)) {
          while (sc.hasNextLine()){
              String expr = sc.nextLine();
              if(expr.matches(pattern))
            	  regextMatch = true;
              else
            	  regextMatch = false;
              
              arr[i]= regextMatch;
              System.out.println(arr[i]);
              i++;
             } 
          }
      catch (IOException e) {
          e.printStackTrace();
      }
	}

}
