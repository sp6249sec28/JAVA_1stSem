import java.util.Scanner;
public class L5HomeAssign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double x = sc.nextDouble();
		double t=x, sum=0;
		int i=1;
		do
		{
			sum = sum + t;
			i=i+2;
			t = -t*x*x/(i*(i-1));
		}
		while (Math.abs(t) > 0.000001);
		System.out.println("sin(x) : " + sum);		

	}

}
