import java.util.Scanner;
public class L3Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount of electricity consumed in units");
		int a = sc.nextInt();
		System.out.println("Do you want to pay online ?(y/n)");
		char ch = sc.next().charAt(0);
		double td=0.0;
		if (a<50) {
			System.out.println(a*3);
		}
		else if (a<200) {
			double b = ((50*3.0) + ((a-49)*4.8));
			td = td+b;
			System.out.println("Total amount: "+ b);
		}
		else if (a<400) {
			double c = ((50*3.0) + (150*4.8) + ((a-199)*5.8));
			td = td+c; 
			System.out.println("Total amount: "+ c);
		}
		else {
			double d = ((50*3.0) + (150*4.8) + (200*5.8) + ((a-400)*6.2));
			td = td+d;
			System.out.println("Total amount: "+ d);
		}
		if (ch=='y') {
			double e = ((3/100.0)*td);
			System.out.println("Discount : "+ e);
			System.out.println("Amount payable: "+ (td-e));
		}
		else if (ch=='n') {
			System.out.print("Amount payable: "+ td);
		}

	}

}
