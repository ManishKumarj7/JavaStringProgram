package com.manish.StringPrograms;

public class Question4_Vowel_Cons_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java program for counting Vowels and Consonant in the String
		
		String name="Manish Anu Saim";
		int Vowelcount=0;
		int Ccount=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||
					name.charAt(i)=='O'||name.charAt(i)=='U'||name.charAt(i)=='a'||
					name.charAt(i)=='e'||name.charAt(i)=='i'||
					name.charAt(i)=='o'||name.charAt(i)=='u') {
				Vowelcount++;
			}else if(name.charAt(i)>='a' && name.charAt(i)<='z'|| name.charAt(i)>='A' && name.charAt(i)<='Z') {
				
				Ccount++;
			}
		}
		System.out.println("Vowel:"+Vowelcount);
		System.out.println("Consonant:"+Ccount);

	}

}
