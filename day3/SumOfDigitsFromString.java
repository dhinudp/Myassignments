package week1.day3;

public class SumOfDigitsFromString {
	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		String newText = text.replaceAll("[^0-9]", "");
		char[] ch = newText.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			int num =Character.getNumericValue(c);
			sum +=num;
			
		}

		System.out.println("Sum : "+sum);
		
	}

}
