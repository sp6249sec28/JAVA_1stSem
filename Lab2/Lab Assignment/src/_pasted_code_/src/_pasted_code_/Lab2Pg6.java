package _pasted_code_;
import java.util.Scanner;
public class Lab2Pg6
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time in seconds:");
		double g = 32.174;
		double t = sc.nextDouble();
		double dist = (1/2.0)*g*t*t;
		System.out.println("The brick travelled "+dist+"feet in time "+t);
		

	}

}
