import java.util.Random;
public class L3HomeAssign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random keyboard = new Random();
		int num = keyboard.nextInt(12)+1;
		String month = switch(num) {
		case 1 -> "January";
		case 2 -> "February";
		case 3 -> "March";
		case 4 -> "April";
		case 5 -> "May";
		case 6 -> "June";
		case 7 -> "July";
		case 8 -> "August";
		case 9 -> "September";
		case 10 -> "October";
		case 11 -> "November";
		case 12 -> "December";
		default -> "None";
		};
		System.out.println("Computer generated month: "+ month +"(" + num +")");
		

	}

}
