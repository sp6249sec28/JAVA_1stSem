import java.util.Scanner;
public class L3Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = keyboard.nextInt();
		if (age >= 18) 
		{
			System.out.println("Yes, You are eligible to cast your vote.");
		}
		else 
		{
			System.out.println("Sorry, You are not eligible to cast your vote.");
		}

	}

}
