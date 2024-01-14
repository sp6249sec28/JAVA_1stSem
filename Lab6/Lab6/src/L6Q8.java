import java.util.Scanner;
public class L6Q8 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String s = sc.nextLine();
		boolean x = palindrome(s);
		System.out.println(s + " in palindrome : " + x);

	}
	public static boolean palindrome(String s)
	{
		if (s==null)
		{
			return false;
		}
		s = s.toLowerCase();
		int left = 0;
		int right = s.length() - 1;
		
		while (left<right) {
		if (s.charAt(left) != s.charAt(right)) {
			return false;
		}
		left++;
		right--;
		}
		
		return true;
	}
}
