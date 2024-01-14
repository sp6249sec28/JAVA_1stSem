import java.util.Scanner;

public class Lab2Pg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a distance in km:");
		double distance = sc.nextDouble();
		double m = distance*1000;
		double feet = distance*3280.8399;
		double inch = distance*6496062.9854999995;
		double cm = distance*100000;
		System.out.println(distance + " km is " + m +" in metres. ");
		System.out.println(distance + " km is " + feet + " in feet. ");
		System.out.println(distance + " km is " + inch + " in inches. ");
		System.out.println(distance + " km is " + cm + " in centimetres. ");
		

		
	}

}
