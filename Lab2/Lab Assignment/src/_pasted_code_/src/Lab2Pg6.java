import java.util.Scanner;
public class Lab2Pg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time in seconds:");
		double t = sc.nextDouble();
		double g = 32.174;
		double dist = (1/2.0)*g*t*t;
		System.out.println("The brick travelled "+dist+" feet in time "+t+" seconds.");
		

	}

}
