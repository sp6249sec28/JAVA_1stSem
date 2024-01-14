import java.util.Scanner;
public class L5Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int c1=0, temp=a, c2=0, rev=0;
		for (int i=2;i<=Math.sqrt(a);i++) {
			if (a%i==0) {
				c1=0;
				break;
			}
		}
		while(a!=0) {
			int r = a%10;
			rev = rev*10+r;//this function reverses the number a
			a = a/10;
		}
		for (int j=2;j<=Math.sqrt(rev);j++) {
			if (rev%j==0) {
				c2++;//or c2 = c2+1;
				break;
			}
		}
		if (c1==0 && c2==0)
			System.out.println(temp + " is twisted prime.");
		else 
			System.out.println(temp + " is not a twisted prime.");

	}

}
