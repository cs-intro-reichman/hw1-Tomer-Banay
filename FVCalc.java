// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// classify the args
		int currentValue = Integer.parseInt (args[0]);
		double interest = Double.parseDouble (args[1]);
		int time = Integer.parseInt (args[2]);

		// equation of Future Value
		double futureValue = currentValue * (Math.pow (1 + (interest/100), time));

		System.out.println("After " + time + " years, a $" + currentValue + " saved at " 
		+ interest + "% will yield $" + (int)(futureValue));
	}
}