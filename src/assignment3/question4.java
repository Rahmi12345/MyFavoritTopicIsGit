package assignment3;

public class question4 {

	public static void main(String[] args) {
	
		int row = 5;
		int culm = 0;
		for (int i = 1; i<=row; ++i, culm = 0) {
			for (int space = 1; space <= row -i; ++space) {
				System.out.print(" ");
			}
			while (culm !=2*i-1) {
				System.out.print("*");
				++culm;
				
			}
			System.out.println();
		}

	}

}
