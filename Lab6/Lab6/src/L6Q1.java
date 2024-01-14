import java.util.Scanner;
public class L6Q1 {
	public static int addition(int a, int b) {
		return (a+b);
	}
	public static int subtraction(int a, int b) {
		return (a-b);
	}
	public static int multiplication(int a, int b) {
		return (a*b);
	}
	public static double division(int a, int b) {
			return (a/b);
	}
	public static double remainder(int a, int b) {
		return (a%b);
	}
	public static double sqroot(double c) {
		return(double)Math.sqrt(c);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for addition.\nEnter 2 for subtraction.\nEnter 3 for multiplication.\nEnter 4 for division.\nEnter 5 for remainder.\nEnter 6 for square root.");
		int num = sc.nextInt();
		if (num==1||num==2||num==3||num==4||num==5)
		{
			System.out.println("Enter the first number: ");
			int a = sc.nextInt();
			System.out.println("Enter the second number: ");
			int b = sc.nextInt();
			switch(num) {
			case 1 : System.out.println("The addition of 2 numbers is " + addition(a,b));break;
			case 2 : System.out.println("The subtraction of 2 numbers is " + subtraction(a,b));break;
			case 3 : System.out.println("The multiplication of 2 numbers is " + multiplication(a,b));break;
			case 4 : System.out.println("The division of 2 numbers is " + division(a,b));break;
			case 5 : System.out.println("The remainder of 2 numbers is " + remainder(a,b));break;
			}
		}

			else {
				switch(num) {
				case 6:System.out.println("Enter the number: ");
				double c = sc.nextDouble();
				System.out.println("The square root of the number is: " + sqroot(c));
				break;
				default:
					System.out.println("Inavlid character!!");
				}
			}
		}
	}

				