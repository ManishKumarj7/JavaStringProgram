package com.manish.StringPrograms;

public class Question3_PunctuationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Java program for counting punctutaion in the string
		
String name="Hey Bunty! , look at your face,you are looking like just a ::::_monkey:::::";
int count=0;
for(int i=0;i<name.length();i++) {
	if(name.charAt(i)=='!'|| name.charAt(i)==','||name.charAt(i)==';'|| name.charAt(i)==':'||name.charAt(i)=='_') {
		count++;
	}
}
System.out.println("Total Number of punctuation in the string is:"+ count);
	}

}
