import java.util.Scanner;
public class L4Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int x = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int y = sc.nextInt();
		/*int min = Math.min(x, y);
		while (min!=0)
		{
			if (x%min==0 && y%min==0)
				break;
			min--;
		}*/
		int r;
		do {
			r=x%y;
			x=y;
			y=r;
		}while(r!=0);
		//System.out.println("GCD of "+ x +" and "+ y +" is "+ x);
		System.out.println("gcd:"+x);
	}

}
