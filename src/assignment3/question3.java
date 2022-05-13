package assignment3;
import java.util.Scanner;
public class question3 {
	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		int num;
        int max = Integer.MIN_VALUE;  
        int min = Integer.MAX_VALUE;  
 
        char select;
        do {
        	System.out.println("Enter number");
        	num = scan.nextInt();
        	
        	if (num > max)
        	{
        		max = num;
        	}
        	if (num < min)
        	{
        		min = num;
        	}
        	System.out.println("do you wnat to continuew y/n?");
        	select = scan.next().charAt(0);
        }
        while (select =='y' || select =='Y');
        		
        	System.out.println("larget number:" + max);
        	System.out.println("smallest number:" + min);

	}

}
