
public class L5HomeAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,i,j,k;
		for(i=0;i<n;i++)
		{ 
			for (j=0;j<n-i-1;j++)
			{ 
				System.out.print(" ");
			}
			for (k=0;k<2*i+1;k++)
			{
				System.out.print("*"); 
			
			}
			System.out.println();

		}

	}

}
