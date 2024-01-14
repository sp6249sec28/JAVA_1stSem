import java.util.Scanner;
public class L6Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of sides in a polygon: ");
		int n = sc.nextInt();
		System.out.println("Enter the length of side of polygon: ");
		int s = sc.nextInt();
		double A = area(n, s);
		System.out.println("Area of the regular polygon is :"+ A);
	}
	public static double area(int n, double s)
	{
		return ((n*s*s)/4*Math.tan(Math.PI/n));
	}
	{
		
	}

}
