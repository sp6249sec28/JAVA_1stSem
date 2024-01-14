import java.util.Scanner;
public class L6Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = sc.nextInt();
		int temp = x;
		int z = reverse(x);
		System.out.println(z); 
		boolean a = palindrome(z, temp);
		System.out.println("Palindrome : "+ a);
		

	}
	public static int reverse(int x)
	{
		int i=1,r,s=0;
		do
		{
			r = x%10;
			s = (s*10)+r;
			x = x/10;
		}
		while(x>0);
		return (s);
	}
	public static boolean palindrome(int a, int b)
	{
		boolean x = true;
		if (a != b)
		{ 
			return (!x);
		}
		else 
		{
			return (x);
		}
	}

}
