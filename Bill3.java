// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// required args
	    String name1 = args [0];
	    String name2 = args [1];
		String name3 = args [2];
		double sub = Double.parseDouble ( args [3] );

		// math equation- devide by 3
		double total =  Math.ceil ( sub / 3.0 );

		// required printed lines
		System.out.println ("Dear " + name3 + ", " + name2 + ", and " +  name1 + 
							": pay " + total + " Shekels each." );
	}
}
