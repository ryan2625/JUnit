package edu.augustana.csc305.labs;

public class NumberUtils {

	/**
	 * @param a - a number to compare
	 * @param b - a number to compare
	 * @param c - a number to compare
	 * @return the largest of the three numbers
	 */                            //3,1,2

	public static int maxOfThree(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else {
				return c;
			}
		} 
		if (c > b) {
			if (c > a) {
				return c;
			} else {
				return a;
				}
			}
		return b;
		}
	
	
	public static void main(String[] args) {
		// NOTE: There's a bug in maxOfThree above... can we find it? 
		System.out.println(maxOfThree(10,20,30) + " should be 30");
		System.out.println(maxOfThree(17,9,2) + " should be 17");
		System.out.println(maxOfThree(1,9,1) + " should be 9");		
		System.out.println(maxOfThree(10,9,10) + " should be 10");
		System.out.println(maxOfThree(1,2,3) + " should be 3");
		System.out.println(maxOfThree(1,3,2) + " should be 3");
		System.out.println(maxOfThree(2,1,3) + " should be 3");
		System.out.println(maxOfThree(2,3,1) + " should be 3");
		System.out.println(maxOfThree(3,1,2) + " should be 3");
		System.out.println(maxOfThree(3,2,1) + " should be 3");
		System.out.println(maxOfThree(999,10,1) + " should be 999");
		System.out.println(maxOfThree(-99,-98,-97) + " should be -97");
		System.out.println(maxOfThree(-100,0,0) + " should be 0");
		System.out.println(maxOfThree(0,0,0) + " should be 0");
		System.out.println(maxOfThree(-99,99,1) + " should be 99");
		
	}

}
