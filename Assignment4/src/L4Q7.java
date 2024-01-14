import java.util.Scanner;
public class L4Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		for (int i=1;i<=10;i++) {
			int sum = a*i;
			System.out.println(a + " * " + i + " = " + sum);
		}
	}

}
