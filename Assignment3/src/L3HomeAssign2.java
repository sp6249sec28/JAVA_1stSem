import java.util.Scanner;
public class L3HomeAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter today's day:");
		int today = keyboard.nextInt();
		System.out.println("Enter the Nos. of days elapsed since today:");
		int Elapsed_day = keyboard.nextInt();
		String day = switch(today) {
		case 0 -> "Sunday";
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";	
		default -> " Invalid input";
		};
		Elapsed_day = (Elapsed_day + today)%7;
		String Futureday = switch (Elapsed_day) {
		case 0 -> "Sunday";
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";	
		default -> " Invalid input";
		};
		System.out.println("Today is "+ day +" and the future day is "+ Futureday);
		
	}

}
