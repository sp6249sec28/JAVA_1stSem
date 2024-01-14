
public class L4HomeAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,sum=0,sum1=0,y,z;
		for(int i=1;i<=10;i++)
		{
			x=(int )Math.pow(i,2);
			sum=sum+x;
		}
		System.out.println("Sum of square of 10 natural numbers = "+sum);
		for(int j=1;j<=10;j++)
		{
			sum1=sum1+j;
		}
		y=(int)Math.pow(sum1,2);
		System.out.println("square of sum of first 10 natural numbers = "+y);
		z=y-sum;
		System.out.println("Hence the difference between the sum of the squares of the first\r\n"
				+ "ten natural numbers and the square of the sum is "+z);

	}

}
