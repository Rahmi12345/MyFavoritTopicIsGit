package assignment3;
import java.util.Scanner;
public class question1 {
	public static void main(String[] args) {
		
		 Scanner kabul = new Scanner(System.in);
		    int number;
		    int i;
		    int even = 0;
		    int odd = 0;
		    System.out.println("How many numbers you want to input: ");
		    i = kabul.nextInt();
		    for (;;) {
		        i--;
		        System.out.println("Please input a number : ");
		        number = kabul.nextInt();
		        if (number % 2 == 0) {
		            even = even + number;
		        } else {
		            odd = odd + number;
		        
		        }
		        if (i == 0) {
		    System.out.println("Sum of even numbers is : " + even);
		    System.out.println("Sum of odd numbers is : " + odd);
		    System.exit(0);
		        }
		    }
	}
}

