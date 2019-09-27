import java.io.IOException;
import java.util.Scanner;

public class URI_1001_Extremamente_Basico {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		int A, B, X;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		X = A + B;
		
		System.out.println("X = " + X);
		
		sc.close();
	}
	
}
