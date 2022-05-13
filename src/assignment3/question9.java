package assignment3;

public class question9 {

	public static void main(String[] args) {

		int [] abc = new int [] {10, 20, 30, 40, 50,60,70};
			System.out.println("Array");
			for (int i=0; i<abc.length;i++) {
			System.out.print(abc[i]+ " ");	
			}
			System.out.println();
			System.out.println("Reverse Array");
			for (int i = abc.length-1; i>=0; i--) {
			System.out.print(abc[i]+ " ");	
			}
	}

}
