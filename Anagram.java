package assignment3;

import java.util.Arrays;

public class Anagram {

	public Anagram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "stops";
    	String str2 = "potss";
    	String text1 = str1.toLowerCase();
    	String text2 = str2.toLowerCase();
    	int length1 = text1.length();
    	int length2 = text2.length();
    	if (length1 == length2) {      
    		char[] a = text1.toCharArray();
    		char[] b = text2.toCharArray();
    		Arrays.sort(a);
    		Arrays.sort(b);
    		boolean result = Arrays.equals(a,b);
    		if(result == true) {
    			System.out.println(text1+ "  and  " +text2+ "  are   anagram");
    		}
    		else {
    			System.out.println(text1+"  and  "+text2+"  are not anagram");
    		}
    	
    	
    	}	
    	
	}
	
	}


