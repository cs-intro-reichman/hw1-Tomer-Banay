// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		Double pv = Double.parseDouble (args[0]);
		Double r = Double.parseDouble (args[1]);
		int t = Integer.parseInt (args[2]);
		 double fv = (pv * Math.pow (1 + r/100, t));

		System.out.print("After " + args [2] + " years, $" + args [0] + " saved at " 
		+ args [1] + "% will yield $" + ((int) fv));
	}
}