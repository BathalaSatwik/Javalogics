package com.logic.w3school;

import java.util.Scanner;

public class TrainSeatManagement {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("---------!Welcome to sabari!---------");
  System.out.println("Enter your number:");
  int num=scan.nextInt();
  int seat=num%8;
  
  switch(seat) {
  case 1:
  case 4:
	  System.out.println("Lower seat enjoy");
	  break;
  
  case 2:
  case 5:
	  System.out.println("Middle seat");
	  break;
  
  case 3:
  case 6:
	  System.out.println("Upper seat");
	  break;
  
  case 7:
	  System.out.println("side lower");
	  break;
  
  case 0:
	  System.out.println("Side upper");
	  break;
 
  }		
}
}
