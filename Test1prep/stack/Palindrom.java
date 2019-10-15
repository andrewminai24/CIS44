import java.util.*;


public class Palindrome{
	public static void main(String[] args){
	String original = "";
	Scanner in = new Scanner(System.in);
	original = in.nextLine();
	System.out.println(isPalindrome(original));
	}
	
	public static String isPalindrome(String original_string){
		String reverse = "";
		int length = original_string.length();
		for(int i = length -1; i >= 0; i--)
		{
			reverse = reverse + original_string.charAt(i);
			
			if(original_string.equals(reverse))
				return "The string is a palindrome";
			else 
				
				return " The string is not a palindrom";
			}
		}
}
