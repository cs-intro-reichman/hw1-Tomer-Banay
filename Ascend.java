// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// declare randon number (a ,b ,c)
		double lim = Double.parseDouble(args [0]);
		double a= Math.random() * lim;
		double b= Math.random() * lim;
		double c= Math.random() * lim;
		

		System.out.println ( (int)(a) + " " + (int)(b) + " " + (int)(c) );

		//find the smallest, middle, biggest
		double smallest = ( Math.min ( a , Math.min ( b , c )));
		double largest = ( Math.max ( a, Math.max ( b , c )));
		double middle = a + b + c - largest - smallest;

		System.out.println ( (int)(smallest) + " " + (int)(middle) + " " + (int)(largest));
	}
}