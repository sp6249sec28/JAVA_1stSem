import java.util.Scanner;
import java.util.Random;
public class L3Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random any = new Random();
		System.out.println("Enter a number(1 - 9):");
		int x = sc.nextInt();
		int r = any.nextInt(9)+1;
		if (x==r) {
			System.out.println("You got it right.");
		}
		else if (r==x+1 || r==x-1) {
			System.out.println("Almost got it right.");
		}
		else {
			System.out.println("You got it wrong.");
		}

	}

} 