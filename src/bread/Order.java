package bread;

import java.util.Scanner;

public class Order 
{
	String [] products = {"bread","roll","bun","flour","poppy seed"};
	double [] prices = {1.6, 0.7, 1.99, 1.49, 0.99};
	public int [] choose = new int[5];
	
	public void _chooseTab() {
		boolean exit = true;
		int temp;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("What you want to buy?\n"
					+ "1. Bread\n"
					+ "2. Roll\n"
					+ "3. Bun\n"
					+ "4. Flour\n"
					+ "5. Poppy seed");
			//Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			temp = s;
			
			System.out.println("How many?");
			s = scan.nextInt();
			choose[temp] = s;
			
			System.out.println("Do you want to exit?\n"
					+ "0. No\n"
					+ "1. Yes\n");
			s = scan.nextInt();
			
			if(s != 0) {exit = false;}			
			
		}while(exit);
		scan.close();
		
	}
	
	public double payment() {
		double summ = 0;
		for(int i = 0;i<5;i++) {
			summ += choose[i] * prices[i];
		}
		return summ;		
	}
	
	
	
}
