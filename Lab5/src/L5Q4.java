import java.util.Scanner;
public class L5Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); 
		System.out.print("Enter the 1st no.: "); 
		int a = keyboard.nextInt(); 
		System.out.print("Enter the 2nd no.: "); 
		int b = keyboard.nextInt(); 
		for (int i = a;i<=b;i++) 
		{
			int fact = 1; 
			for (int j=1;j<=i;j++) 
			{
				fact*=j; 
			} 
			System.out.println("The factorial of "+i+" is: "+fact);
		} 
		keyboard.close(); 

	}

}
