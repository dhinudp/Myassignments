package week1.day3;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		char[] cha = test.toCharArray();
		for (int i = 0; i < cha.length; i++) {
			if (i%2==0) {
				continue;
				
			}
			else {
				cha[i]=Character.toUpperCase(cha[i]);
			}
			
		}
		System.out.println(new String (cha));
		
	}

}
