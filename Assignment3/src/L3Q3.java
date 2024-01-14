import java.util.Scanner;
public class L3Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd number:");
		int c = sc.nextInt();
		if (a<b && b<c)
		{
			System.out.println("Increasing.");
		}
		else if (a>b && b>c)
		{
			System.out.println("Decreasing.");
		}
		else 
		{
			System.out.println("Neither increasing nor decreasing.");
		}
	}
}
