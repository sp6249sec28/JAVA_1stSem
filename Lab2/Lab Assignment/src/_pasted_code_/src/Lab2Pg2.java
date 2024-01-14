import java.util.Scanner;
public class Lab2Pg2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a distance in km:");
		double distance = sc.nextDouble();
		double m, feet, inch,cm;
		m = distance*1000;
		feet = distance*3280.8399;
		inch = distance*39370.0787;
		cm = distance*100000;
		System.out.println(distance + " km is " + m +" in metres. ");
		System.out.println(distance + " km is " + feet + " in feet. ");
		System.out.println(distance + " km is " + inch + " in inches. ");
		System.out.println(distance + " km is " + cm + " in centimetres. ");
	
	}

}
