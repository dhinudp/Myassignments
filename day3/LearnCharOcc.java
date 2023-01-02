package week1.day3;

public class LearnCharOcc {
	public static void main(String[] args) {
		String str = "Testleaf";
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]== 'e') {
				count++;
				
			}
			
		}
		
		System.out.println("occurence of 'e' in testleaf is "+ count);
	}
	
	

}
