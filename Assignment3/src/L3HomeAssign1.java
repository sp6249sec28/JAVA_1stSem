import java.util.*;
//Either use * or Scanner and Random in two lines
public class L3HomeAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the 'Scissor-Rock-Paper' game !!");
		System.out.println("Scissor(0), Rock(1), Paper(2)");
		//Random rand = new Random();
		int User = keyboard.nextInt();
		//int SYstem = rand.nextInt(3);
		int SYstem=(int)(Math.random()*2+0);
		String line1 = switch(User) {
		case 0 -> "Scissor";
		case 1 -> "Rock";
		case 2 -> "Paper";
		default -> "Wrong Response";
		};
		String line2 = switch(SYstem) {
		case 0 -> "Scissor";
		case 1 -> "Rock"; 
		case 2 -> "Paper";
		default -> "Wrong Response";
		};
		if ((User==0 && SYstem==2) || (User==1 && SYstem==0) || (User==2 && SYstem==1)) {
			System.out.println("Computer chose: " + line2 + " , You chose: " + line1 + " , YOU WIN!!");
		}
		else if ((User==2 && SYstem==0) || (User==0 && SYstem==1) || (User==1 && SYstem==2)) {
			System.out.println("Computer chose: " + line2 + " , You chose: " + line1 + " , YOU LOSE!!");
		} 
		else if ((User==0 && SYstem==0) || (User==1 && SYstem==1) || (User==2 && SYstem==2)) {
			System.out.println("Computer chose: " + line2 + " , You chose: " + line1 + " , IT'S A DRAW!!");
		}
		else {
			System.out.println("Wrong Response.");
		}
		
	}

}
