package assignment3;

public class FindTypes {

	public FindTypes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 11st Class of selenium $";
		int  letter = 0, Space = 0, num = 0, SpecialChar = 0;
		char[] ch= test. toCharArray();
		for (int i = 0; i < test. length(); i++) { 
			System. out. print(test. charAt(i));
			if( Character.isLetter(ch[i])) {
				letter++;
		}
			else if( Character.isDigit(ch[i])) {
			num++;
	}
			else if( Character.isSpace(ch[i])) {
				Space++;
			}
			

			else {
				SpecialChar++;
			}
			System.out.println("Letter Count is "+ letter);
			System.out.println("Digit Count is "+ num);
			  System.out.println("Space Count is "+ Space);
		    System.out.println("Special Character Count is "+ SpecialChar);
}
	}
}
		