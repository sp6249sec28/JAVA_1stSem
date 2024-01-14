import java.util.Scanner;
public class L5Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=2;i<=15;i++) 
		{ 
			System.out.println("Multiplication table for "+i); 
			for(int j=1;j<=10;j++) 
			{
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}

	}

}
