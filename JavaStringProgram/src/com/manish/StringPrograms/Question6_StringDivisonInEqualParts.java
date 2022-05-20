package com.manish.StringPrograms;

import java.util.Scanner;

public class Question6_StringDivisonInEqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// java program for dividing String into equal parts
		
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		 String name=sc.nextLine();
		 System.out.println("Enter number of parts you want to divide the string:");
		
		int n=sc.nextInt();
		int len=name.length();
		 int temp=0,chars=len/n;
		 String[]eqlString=new String[n];
		 if(len%n!=0) {
			 System. out.println("String can't be divided in equal parts");
		 }else {
			 for(int i=0;i<len;i=i+chars) {
				 String part=name.substring(i,i+chars);
				 eqlString[temp]=part;
				 temp++;
			 }
			 System.out.println(n+"Equal parts of given strings are:");
			 for(int i=0;i<eqlString.length;i++) {
				System.out.println(eqlString[i]); 
			 }
		 }
		 }

}
