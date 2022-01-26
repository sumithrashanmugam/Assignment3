package assignment3;

public class Reverse {

	public static void main(String[] args)
    {
        String s[] ="i'm a software tester".split(" ");
        String A = "";
        for (int i = s.length - 1; i >= 0; i--) 
        {
            A += s[i] + " ";
        }
        System.out.println("Reversed String:");
        System.out.println(A.substring(0, A.length() - 1));
    }
}
		


