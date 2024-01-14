import java.util.Scanner;
public class L6Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		double t = triangle(x,y);
		double s = square(x);
		double c = circle(x);
		double r = rectangle(x,y);
		System.out.println("The area of triangle is : "+ t);
		System.out.println("The area of square is : "+ s);
		System.out.println("The area of circle is : "+ c);
		System.out.println("The area of rectangle is : "+ r);
	}
	public static double triangle(int x, int y) {
		return ((1/2)*x*y);
	}
	public static double square(int x) {
		return (Math.pow(x, 2));
	}
	public static double circle(int x) {
		return (Math.PI*x*x);
	}
	public static double rectangle(int x, int y) {
		return (x*y);
	}
	

}
