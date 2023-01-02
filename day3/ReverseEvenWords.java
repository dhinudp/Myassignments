package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] a = test.split(" ");
		for (int i = 0; i < a.length; i++) {
			if (i%2!=0) {
				char[] charArray = a[i].toCharArray();
				for (int j = charArray.length-1; j >=0; j--) {
					System.out.println(charArray[j]+ " ");
					
				}
				
			}
			else {
				
				System.out.println(a[i]+ " ");
			}
			
		}
		
		

	}

}
