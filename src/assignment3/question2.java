package assignment3;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
	 Scanner code = new Scanner(System.in);
			int num1;
			int num2;
			char select;
			do {
			System.out.println("enter first number");
			num1 = code.nextInt();
			System.out.println("enter second number");
			num2 = code.nextInt();
				
			int tol = num1 + num2;
			System.out.println("total of numbers " + tol);
			System.out.println("do yo wnat to continue y/n?");
			select = code.next().charAt(0);
				
			}
			while (select =='y' || select =='Y');
		
	
	}

}
