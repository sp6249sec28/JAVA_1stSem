import java.util.Scanner;
public class L5Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b = sc.nextInt();
		int sum_a = 0, sum_b = 0;
		for (int i=1;i<=a/2;i++) {
			if (a%i==0)
				sum_a += i;
		}
		for (int j=1;j<=b/2;j++) {
			if (b%j==0)
				sum_b += j;
		}
		if (sum_a == b && sum_b == a)
			System.out.println(a + " and " + b + " are amicable numbers.");
		else
			System.out.println(a + " and " + b + " are not amicable numbers.");

	}

}
