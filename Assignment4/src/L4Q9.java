import java.util.Scanner;
public class L4Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number(10 digit):");
		int x = sc.nextInt();
		int Newnum = 0,idx=0;
		int i = x;
		while (i!=0) {
			int d = i%10;
			if (d!=0) {
				Newnum += (int)(d*(Math.pow(10, idx)));
				idx++;
			}
			i/=10;
		}
		System.out.println("Original number "+ x);
		System.out.println("New number "+ Newnum);
	}
}