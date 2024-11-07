// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// classify the args
		int cv = Integer.parseInt (args[0]);
		double r = Double.parseDouble (args[1]);
		int t = Integer.parseInt (args[2]);

		// equation of Future Value
		double fv = cv * (Math.pow (1 + (r/100), t));

		System.out.println("After " + t + " years, $" + cv + " saved at " 
		+ r + "% will yield $" + (int)(fv));
	}
}