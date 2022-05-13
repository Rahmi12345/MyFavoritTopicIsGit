package assignment3;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		int [] array = new int [10];
		int total = 0;
		System.out.println("enter numbers");
		for (int i = 0; i<array.length; i ++) {
			array [i]= scan.nextInt();
			total += array[i];
			
		}
		System.out.println("total" + total);
		}

	}
	



