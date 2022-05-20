package com.manish.StringPrograms;

public class Question7_SubSetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print the substring of the String
		
		String name="Manish";
		int len=name.length();
		int temp=0;
		String champ[]=new String[len*(len+1)/2];
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				champ[temp]=name.substring(i,j+1);
				temp++;
			}
		}
		System.out.println("All Subseet of given Strings are:");
		for(int i=0;i<champ.length;i++) {
			System.out.println(champ[i]);
		}
	}

}
