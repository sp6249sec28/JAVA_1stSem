import java.util.*;
public class Lab2Pg4 
{
	public static void main(String[] args)
	{
		int n,r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		r=n%10;
		n=n/10;
		sum=sum+r;
		r=n%10;
		n=n/10;
		sum=sum+r;
		r=n%10;
		n=n/10;
		sum=sum+r;
		System.out.println("sum of number="+sum);
	}

}
