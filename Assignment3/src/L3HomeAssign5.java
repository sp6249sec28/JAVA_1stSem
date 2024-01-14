import java.util.Scanner;
public class L3HomeAssign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your gender(M/F):");
		String gender = keyboard.next();
		System.out.println("Enter your First name:");
		String First_name = keyboard.next();
		System.out.println("Enter your Last name:");
		String Last_name = keyboard.next();
		if (gender.contains("F")){
			System.out.println("Enter your age:");
			int age = keyboard.nextInt();
			if (age>=20) {
				System.out.println(First_name + ", are you married(Y/N)? :");
				String marital = keyboard.next();
				if (marital.contains("Y")) {
					System.out.println("Then I shall call you Mrs. " + First_name +" "+ Last_name);
				}
				else if (marital.contains("N")) {
					System.out.println("Then I shall call you Ms. "+ First_name + " " + Last_name);
				}
				else {
					System.out.println("Invalid Marital Input!!");
				}
			}
			else { 
				System.out.println("Then I shall call you " + First_name + " " + Last_name);
			}
		}
		else if(gender.contains("M")){
			System.out.println("Enter your age:");
			int age = keyboard.nextInt();
			if (age>=20) {
				System.out.println("Then I shall call you Mr. " + First_name + " " + Last_name);
			}
			else if (age<20){
				System.out.println("Then I shall call you " + First_name + " " + Last_name);
			}
			
		}
		else {
			System.out.println("Invalid Input!!");
		}

	}
}
