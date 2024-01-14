import java.util.Scanner;
public class Lab2Pg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of hemisphere:");
		double rad = sc.nextDouble();
		double SA = Math.PI*3*rad*rad;
		double Vol = Math.PI*(2/3.0)*rad*rad*rad;
		System.out.println("Surface area and Volume of hemisphere of radius "+rad+" cm are "+SA+" metre-sq and "+Vol+" metre-cube respectively.");
		

	}

}
