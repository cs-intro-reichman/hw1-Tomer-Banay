// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // clasify
		int Num = Integer.parseInt ( args [0] );
		int hundreds = Num / 100;
		int tens = ( Num / 10 ) - ( hundreds * 10 );
		int units = ( Num - ( hundreds * 100 ) - ( tens * 10 ) );
		
		// print selected lines
		System.out.println ( hundreds + " hundreds, " + tens + 
							" tens, and " + units + " ones." );
	}
}
