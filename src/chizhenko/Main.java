package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int newX;
		String str;
		String newStr = "";
		
		System.out.println("enter a six-digit number");
		
		x = sc.nextInt();
		
		sc.close();
		
		str = Integer.toString(x);
		
		if (str.length() != 6) {
			System.out.println("invalid number");
		} else {
			for(int i = str.length() - 1; i >=0; i--) {
				newStr = newStr + str.charAt(i);
			}
		};
		
		newX = Integer.parseInt(newStr);
		
		if (x == newX) {
			System.out.println("this is a palindrome");
		} else {
			System.out.println("this is not a palindrome");
		}
	}

}
