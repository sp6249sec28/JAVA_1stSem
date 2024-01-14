import java.util.Scanner;
public class HomeAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of minutes:");
		double min = sc.nextDouble();
		double year = min/525600;
		double day = (min%525600)/1440;
		System.out.println(min+" minutes is approximately "+(int)year+" years & "+(int)day+" days.");

	}

}
