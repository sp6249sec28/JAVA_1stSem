import java.util.Scanner;
public class L4Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println("Enter the third number:");
		int c = sc.nextInt();
		int sum = 0;
		for(int i=a;i<=b;i=i+c) {
			sum = sum + i;
			System.out.println(i+" ");
		}
		System.out.println("The sum of numbers displayed is: " + sum);
		
	}

}
