import java.util.Scanner;
public class L3Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x-coordinate:");
		double x = sc.nextDouble();
		System.out.println("Enter the y-coordinate:");
		double y = sc.nextDouble();
		if (x>0 && y>0) {
			System.out.println(x+", "+y+ " is in 1st quadrant.");
		}
		else if (x<0 && y>0) {
			System.out.println(x+", "+y+ " is in 2nd quadrant.");
		}
		else if (x<0 && y<0) {
			System.out.println(x+", "+y+ " is in 3rd quadrant.");
		}
		else if (x>0 && y<0) {
			System.out.println(x+", "+y+ " is in 4th quadrant.");
		}
		else if (x==0) {
			System.out.println(x+", "+y+ " is on the y-axis.");
		}
		else if (y==0) {
			System.out.println(x+", "+y+ " is on the x-axis.");
		}
		else if (x==0 && y==0){
			System.out.println(x+", "+y+ " lies in origin.");
		}
		else {
			System.out.println("Invalid input.");
		}
	}

}