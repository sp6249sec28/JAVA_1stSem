import java.util.Scanner;
public class L6Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int ch = count(x);
		System.out.println("The number of vowels in " + x + " is: " + ch);

	}
	public static int count(String x)
	{
		int count = 0;
		for (int i=0;i<x.length();i++)
		{
			if (x.charAt(i)=='a' || x.charAt(i)=='e' ||x.charAt(i)=='i' ||x.charAt(i)=='o' || x.charAt(i)=='u' )
			{
				count++;
			}
		}
		return count;

	}

}
