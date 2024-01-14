import java.util.Scanner;
public class L3Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();
		int max = (Math.max(Math.max(a, b), c));
		int min = (Math.min(Math.min(a, b), c));
		int med = ((a+b+c)-(max +min));
		System.out.println("Largest number: " +max);
		System.out.println("Second largest number: " +med);
	}

}
