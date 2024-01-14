import java.util.Scanner;
public class L5HomeAssign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.println("When n = 1 fibonacci series: 0");
		for(int i=2;i<=n;i++)
		{
			int a=0,b=1,c;
			System.out.print("When n = " +i+" fibonacci series: " + a + " " + b);
			for(int j=3;j<=i;j++)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.print(" "+c);
			}
			System.out.println();
		}

	}

}
