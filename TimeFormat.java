// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // formatted minutes if less then 10
		String formattedMinutes = minutes < 10 ? "0" + minutes : "" + minutes;

		// AM / PM
		 if ( hours > 12 )  {
			hours = hours - 12;
			System.out.println ( hours + ":" + formattedMinutes + " PM" );
		}
		else {
		if (hours < 12)
			System.out.print ( hours + ":" + formattedMinutes + " AM" );
		else {
			System.out.println ( "12" + ":" + formattedMinutes + " PM" );
				}
			}
		}
	}	

