import java.util.Scanner;
public class L4Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int sum = 0, i=1;
		double avg;
		do
		{
			int no = (int)(Math.random()*n+1);//math.random()*(max-min)+min)
			sum=sum+no;
			i++;
			System.out.println(no+"  ");
		}
		while (i<=n);
		avg = (double)sum/n;
		System.out.println("\nAverage of  " + n + " random numbers is " + avg);
		
	}

}
