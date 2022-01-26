package assignment3;

public class CharOccurence {

	public CharOccurence() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "world is full of crazy people";
		int count=0;
		char[]charArray = a .toCharArray();
		a. length();
		for(int i=0;i<charArray.length; i++) {
			char b = a.charAt(i);
			if(b == 'l') {
		count++;
		System.out.println("CharOcurence is  "+count);
	}
	else {

System.out.println("Total CharOcurence is  "+count);

}

	}
	}
}
