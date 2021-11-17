package edu.augustana.csc305.labs;

// Supervisor's note: Here's the smelly code that Hannaldous left us...
//
// In this order, please:
//  First, try to figure out what each method DOES by reading the code 
//     and methodically testing each method (from main).
//  Second, create a HannaldousTest class with a series of unit tests
//     that carefully test ALL the methods inside Hannaldous
//     that test the full range of behavior (including corner cases)
//  Third, refactor this code to make it as elegant as possible!
//      After each change, run your suite of unit tests to make sure
//      that all tests still pass!
//  Fourth, include a proper Javadoc comment for the public method 
//         (see Skrien appendix B, pp 318-331)
//   
//  NOTE: You should leave the class name (Hannaldous) the same, 
//       but methods should be renamed, parameters improved, etc...
//
//  HINT: the post-increment operator (e.g. i++) is weirder than you knew
//         (read Skrien appendix B, pp 318-331)

public class Hannaldous {
	
	
	// Method one checks to see if there are consecutive repeated 
	// characters in the password and checks the password length.
	// If the password is too short or it has consecutive repeated
	// characters, the password is too weak.
	
	public static String passwordStrengthEvaluator(int passwordToEvaluate, String[] passwords) {
		
		int passwordLength = passwords[passwordToEvaluate].length();
		if (passwordLength <= 8) {
			return "Password is not long enough!";
		}
		
		String passwordString = passwords[passwordToEvaluate];
		for (int i = 0; i < passwordLength - 1; i++) {
			if (passwordString.charAt(i) == passwordString.charAt(i+1)) {
				return "Password is too weak. Don't use consecutive "
						+ "characters!";
			}
			if ((passwordStrengthEvaluator2(passwordString) != true)) {
				return "You need at least one upper case, one lower case, "
						+ "and one digit in your password!";
			}
		}
		return "Password is strong enough!";
						}
	// Method two checks to see if the password contains an 
	// upper case letter, a lower case letter, and a number.
	
	static boolean passwordStrengthEvaluator2(String passwordString){
		int complexityRating = 3;
		int currentComplexityRating = 0;
		int passwordLength = passwordString.length();
		
		for (int i = 0; i < passwordLength; i++) {
			char ch = passwordString.charAt(i);
			if (Character.isUpperCase(ch)) {
				currentComplexityRating++;			
			}
			if (Character.isLowerCase(ch)) {
				currentComplexityRating++;			
			}
			if (Character.isDigit(ch)) {
				currentComplexityRating++;			
			}
		}
		if (currentComplexityRating == complexityRating) {
			return true;
		}
		return false;

	}
		
		
	
	
	public static void main(String[] args) {
		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		passwordStrengthEvaluator(1, passwords);
		passwordStrengthEvaluator(2, passwords);
		passwordStrengthEvaluator(3, passwords);
		passwordStrengthEvaluator(4, passwords);
		
	}

}
