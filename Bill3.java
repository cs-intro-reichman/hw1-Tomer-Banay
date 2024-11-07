// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
	    String name2 = args[1];
		String name3 = args[2];
		double sub = Double.parseDouble(args [3]);

		//now we will do the math equastion
		double total = (int) ((sub/3)+1);

		//put the required printed lines
		System.out.println("Dear " + args[0] +", "+ args[1] +", and "+  args[2] + ": pay " +
		total + " Shekels each.");
	}
}
