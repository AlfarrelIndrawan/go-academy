package goacademy;

import java.util.Scanner;

public class Latihan {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String com = "";
		double total = 0;
		while(!com.equalsIgnoreCase("exit")) {
			com = in.next();
			if(com.equalsIgnoreCase("cancel")) System.out.println("0.0");
			else if(com.equalsIgnoreCase("exit")) break;
			else {
				int num = in.nextInt();
				switch(com) {
				case "add": total += num; break;
				case "subtract": total -= num; break;
				case "multiply": total *= num; break;
				case "divide": if(num==0) total=0; else total /= num; break;
				}
				System.out.printf("%.1f %n",total);
			}
		}
	}
}
