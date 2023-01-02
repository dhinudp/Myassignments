package week1.day3;

import java.util.Arrays;

public class LearnArray {
	public static void main(String[] args) {
		int[] nums={45,567,67,8787,5657,23,19};
		Arrays.sort(nums);
		int length = nums.length;
		System.out.println("Length of the array is "+length);
		System.out.println( "minimum value is "+nums[0]);
		System.out.println("maximum value is "+nums[6]);
		System.out.println("2nd largest value of the array is "+nums[nums.length-2]);
		
		
		
	}

}
