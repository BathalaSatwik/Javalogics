package com.logic.w3school;

import java.util.Scanner;

public class CountOfDigits {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int num=scan.nextInt();
	int temp=num;
	
	int count =0;
	
	while(num>0) {
		num/=10;
		count++;
	}
	System.out.println("The Entered digit count:" +count);	
}
}
