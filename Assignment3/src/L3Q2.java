import java.util.Scanner;
public class L3Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Dear Alice !!, Enter the amount of water you drunk(ml.):");
		int x=keyboard.nextInt();
		if (x >= 5000) {
			System.out.println("Yes, Alice is following doctor's advice.");
		}
		else {
			System.out.println("No, Alice is not following doctor's advice.");
			
		}
		

	}

}
