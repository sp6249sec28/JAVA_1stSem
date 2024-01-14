import java.util.Scanner;
public class L4Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=keyboard.nextInt();
		int x=3,pow=1;
		while(pow*3<=n) 
		{
			pow*=3;
		}
		System.out.println("power of 3 less than or equal to  "+n+" is "+pow);

	}

}
