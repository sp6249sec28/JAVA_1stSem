import java.util.Scanner;
public class HomeAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ënter the number of eggs:");
		int eggs = sc.nextInt();
		int gross = eggs/144;
		int dozen = (eggs%144)/12;
		int left = (eggs%144)%12;
		System.out.println(eggs+" eggs = "+gross+" gross "+dozen+" dozens "+left+" eggs.");
		
	}

}
