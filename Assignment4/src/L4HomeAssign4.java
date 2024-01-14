import java.util.Scanner;
public class L4HomeAssign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int sum=0,p=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				sum=sum+i;
			else
				p=p*i;
		}
		System.out.println("Sum of all even numbers="+sum);
		System.out.println("Product of all odd numbers="+p);

	}

}
