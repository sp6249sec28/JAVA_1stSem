import java.util.Scanner;
public class L5Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); 
		System.out.print("Enter any no.: "); 
		int n = keyboard.nextInt(); 
		int sum=0; 
		for (int i=1;i<=n;i++) 
		{ 
			for(int j=1;j<=i;j++) 
			{ 
				sum+=j; 
			}
		}
		System.out.println("Result is: "+sum); 
		keyboard.close();

	}

}
