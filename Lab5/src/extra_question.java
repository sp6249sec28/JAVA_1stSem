
public class extra_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a =65;
		int n=5,i,j,k;
		for(i=0;i<n;i++)
		{ 
			for (j=0;j<n-i-1;j++)
			{ 
				System.out.print(" ");
			}
			for (k=0;k<2*i+1;k++)
			{
				System.out.print((char)(a+i)); 
			
			}
			System.out.println();
		}

	}

}
