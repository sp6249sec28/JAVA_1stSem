import java.util.Scanner;
public class L4Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = sc.nextInt();
		int sum = 0;
		for (int i=1;i<=x/2;i++)
		{ 
			if (x%i==0)
				sum = sum + i;
		}
		if (sum == x)
			System.out.println(x + " is a perfect number.");
		else 
			System.out.println(x +" is not a perfect number.");

	}

}
