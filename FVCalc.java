// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// classify the args
		double pv = Double.parseDouble (args[0]);
		double r = Double.parseDouble (args[1]);
		int t = Integer.parseInt (args[2]);

		// equation of Future Value
		double fv = (pv * Math.pow ((1 + r/100), t));

		System.out.print("After " + args [2] + " years, $" + args [0] + " saved at " 
		+ r + "% will yield $" + ((int) fv));
	}
}