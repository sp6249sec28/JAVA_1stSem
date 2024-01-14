import java.util.Scanner;
public class L6Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = y-x;
		int d = numberofdaysinayear(z);
		System.out.println("No. of days in years :" + d);

	}
	public static int numberofdaysinayear(int year) 
	{
		return (year*12*30);
	}

}
