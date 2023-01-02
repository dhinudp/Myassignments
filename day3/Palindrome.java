package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		String str ="madam";
		String rev ="";
		int len = str.length();
		for (int i = len-1; i >=0; i--) {
			rev = rev+str.charAt(i);
			
		}
		if (str.equals(rev)) {
			System.out.println("It is a palindrome");
			
		}
		else {
			System.out.println("It is not a palindrome");
		}
		

	}

}
