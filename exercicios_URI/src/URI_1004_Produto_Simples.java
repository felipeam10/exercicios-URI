/*
public class URI_1004_Produto_Simples {

	public static void main(String[] args) {
		
		int A = 3;
		int B = 9;
		int PROD;
		
		PROD = A*B;
		
		System.out.println("PROD = " + PROD);
	}
	
}
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class URI_1004_Produto_Simples {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int A, B, PROD;

		A = sc.nextInt();
		B = sc.nextInt();

		PROD = A * B;

		System.out.println("PROD = " + PROD);

		sc.close();

	}

}