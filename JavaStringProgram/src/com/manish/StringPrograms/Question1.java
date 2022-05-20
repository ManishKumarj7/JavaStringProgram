package com.manish.StringPrograms;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//A java Program to count the total number of characters in string
		
		String champ="Hey Boie! you r a champion";
		int count=0;
		for(int i=0;i<champ.length();i++) {
			if(champ.charAt(i)!=0) {
				count++;
			}
		}
		System.out.println("total number of chartacter in the string:="+count);
	}

}
