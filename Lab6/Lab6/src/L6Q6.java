import java.util.Scanner;
public class L6Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		char ch = sc.next().charAt(0);
		System.out.println("The number of occurences of " + "'" + ch + "'" + "is:" + count(x,ch));

	}
	public static int count(String x, char ch)
	{
		int count = 0;
		for (int i=0;i<x.length();i++)
		{
			if (x.charAt(i)==ch)
				count++;
		}
		return count;
	}

}
