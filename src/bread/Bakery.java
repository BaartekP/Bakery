package bread;
import java.util.Scanner;

public class Bakery {

	public static void main(String[] args) {
		
		
		System.out.println("Hello! \nWhat is your name?");
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		System.out.println(s + ", Please welcome");

		
		Order order1 = new Order();
		order1._chooseTab();
		
		System.out.printf("You need to pay %.2f z�\n",order1.payment());	
		System.out.println("Thank you for visiting us "+s+", see you next time");
		scan.close();
		
	}

}


