import java.util.Scanner;
public class L6Q2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			int z = pentagonal(i);
			System.out.print(" "+z);
			if (i%10==0)
				System.out.println();
		}

	}
	public static int pentagonal(int i) {
		return (i*(3*i-1)/2);
	}

}
