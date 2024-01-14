import java.util.Scanner;
public class L3Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your marks out of 100:");
		int m = keyboard.nextInt();
		if (m>=0 && m<=100) {
			switch (m/10) {
			case 9,10 -> System.out.println("Your grade is 'O'.");
			case 8 -> System.out.println("Your grade is 'A'.");
			case 7 -> System.out.println("Your grade is 'B'.");
			case 6 -> System.out.println("Your grade is 'C'.");
			case 5 -> System.out.println("Your grade is 'D'.");
			case 4 -> System.out.println("Your grade is 'E'.");
			default -> System.out.println("Your grade is 'F'.");
			}
		}

	}

}
+