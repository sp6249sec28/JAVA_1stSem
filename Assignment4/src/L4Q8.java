import java.util.Scanner;
import java.util.Random;
public class L4Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r=0;
		while (true) {
			System.out.println("Enter a number of your choice:");
			int x = sc.nextInt();
			r = 1+(int)(Math.random()*9);
			if (x>r) {
				System.out.println("Too high, try again.");
			}
			else if (x<r) {
				System.out.println("Too low, try again.");
			}
			else {
				System.out.println("Good guess.");
				break;
			}
		}

	}

}
