package assignment3;
import java.util.Scanner;
public class question8 {
	public static void main(String[] args) {
		
	      int[] list1 = new int[5];
	      int[] list2 = new int[5];

	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter list1 number");

	      for (int i = 0; i < 5; i++)
	      {
	          list1[i] = scan.nextInt();
	      }

	      for (int i = 0; i < 5; i++)
	      {
	          list2[i] = list1[i];
	      }
	      
	      System.out.println("list2");
	      for (int i = 0; i < 5; i++)
	      {
	          System.out.println(list2[i]);
	      }

	}

}
