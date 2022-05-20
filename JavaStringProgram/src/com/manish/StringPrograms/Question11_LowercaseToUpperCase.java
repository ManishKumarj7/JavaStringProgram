package com.manish.StringPrograms;

public class Question11_LowercaseToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1="MaNiSh KuMaR";    
	        StringBuffer str2=new StringBuffer(str1);    
	            
	        for(int i = 0; i < str1.length(); i++) {    
	                
	            //Checks for lower case character    
	            if(Character.isLowerCase(str1.charAt(i))) {    
	                //Convert it into upper case using toUpperCase() function    
	            	str2.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
	            }    
	            //Checks for upper case character    
	            else if(Character.isUpperCase(str1.charAt(i))) {    
	                //Convert it into upper case using toLowerCase() function    
	            	str2.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
	            }    
	        }    
	        System.out.println("String after case conversion : " + str2);    
	}

}
