import java.util.Scanner;
public class L5Q9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); 
		System.out.print("Enter any no.: "); 
		int n = keyboard.nextInt(); 
		double sum=0; 
		for (int i=1;i<=n;i++) 
		{
			sum=sum+(1.00/(i*i)); 
		} 
	    System.out.println("Result : "+sum); 
		keyboard.close();

	}

}
