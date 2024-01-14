import java.util.Scanner;
public class L3Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of electricity consumed in units:");
		int a = sc.nextInt();
		if (a<50) {
			System.out.println("Your monthly electricity bill is "+ a*3);
		}
		else if (a<200) {
			System.out.println("Your monthly electricity bill is "+ ((50*3.0) + (a-49)*4.8));
		}
		else if (a<400) {
			System.out.println("Your monthly electricity bill is "+ ((50*3.0) + (150*4.8) + (a-199)*5.8));
		}
		else {
			System.out.println("Your monthly electricity bill is "+ ((50*3.0) + (150*4.8) + (200*5.8) + ((a-400)*6.2)));
		}
	}

}
