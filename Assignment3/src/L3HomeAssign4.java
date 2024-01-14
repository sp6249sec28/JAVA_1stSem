import java.util.Scanner; 
public class L3HomeAssign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = keyboard.nextInt();
		System.out.print("Is "+ num + " divisible by 5 and 6 : ");
		if (num%5==0 && num%6==0) 
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		
		System.out.print("Is "+ num + " divisible by 5 or 6 : ");
		if (num%5==0 || num%6==0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		System.out.print("Is "+ num + " divisible by 5 or 6, but not both : ");
		if (num%5==0 ^ num%6==0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		keyboard.close();
	}
}
