import java.util.Scanner;
public class L4Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b,p,power=1;
		System.out.println("Enter the base:");
		b = sc.nextInt();
		System.out.println("Enter the power:");
		p = sc.nextInt();
		for (int i=1;i<=p;i++) {
			power = power*b;
		}
		System.out.println(b + " to the power " + p + " is: " + power);

	}

}
