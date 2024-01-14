import java.util.Scanner;
public class L5Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); 
		System.out.print("Enter the 1st no.: "); 
		int a = keyboard.nextInt(); 
		System.out.print("Enter the 2nd no.: "); 
		int b= keyboard.nextInt(); 
		System.out.print("Prime numbers between "+a+" & "+b+" are: "); 
		for (int i=a;i<b;i++) 
		{
			int c=0;
		    for (int j=1;j<=i;j++) 
		    { 
		    	if(i%j==0)
		    		c++;
		    }
		    if(c==2) 
	    		System.out.print(i+" ");
		}
	}
}
