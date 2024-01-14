import java.util.Scanner;
public class L5Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int a=0, b=1, c=1;
		System.out.print(a + " " + b + " " + c + " ");
		for (int i=4;i<=n;i++)
		{
			int sum = a+b+c;
			System.out.print(sum + " ");
			a=b;
			b=c;
			c=sum;
		}
		
	}

}
