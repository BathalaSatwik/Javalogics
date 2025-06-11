package logic;

import java.util.Scanner;

public class ArmstrongNumber {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int num=scan.nextInt();
	 int temp=num;
	 int count=0;
	 int result=0;
	 int digit=0;
	 
	 while(num>0) {
		 num=num/10;
		 count++;
	 }
	 num=temp;
	 
	 while(num>0) {
		 digit=num%10;
		 result+=Math.pow(digit,count);
		 num/=10;	 
	 }
	 if(temp==result) {
		 System.out.println("Armstrong number:"+result);
	 }
	 else {
	 System.out.println("Not a armstrong number");
	 }
 }
}
