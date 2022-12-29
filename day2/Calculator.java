package week1.day2;

public class Calculator {
	
	public static int addThreeNum(int num1, int num2, int num3) {
		return num1+num2+num3;
		
		

	}
	public static int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	public static void divide() {
		int num1 = 6;
		int num2 =2;
		
		System.out.println(num1/num2);
		
		
	}
	public static void main(String[] args) {
		int sum = addThreeNum(3, 2, 1);
		int mul = multiply(5,1);
		System.out.println(sum);
		System.out.println(mul);
		divide();
		
		
	}
 
	

}
