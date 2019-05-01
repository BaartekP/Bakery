package bread;
import java.util.Scanner;

public class Bakery {

	public static void main(String[] args) {
		
		
		System.out.println("Hello! \nWhat is your name?");
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		
		System.out.println(s + ", Please welcome");
		
		Order order1 = new Order();
		order1._chooseTab();
		
		System.out.printf("%s , You need to pay %.2f z³",s,order1.payment());
		
		
		
		
		
		
		
	}

}


