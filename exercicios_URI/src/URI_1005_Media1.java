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

public class URI_1005_Media1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double A, B, MEDIA;

		A = sc.nextDouble();
		B = sc.nextDouble();

		MEDIA = ((A*3.5) + (B*7.5))/11;

		System.out.println("MEDIA = %.5f\n" + MEDIA);

		sc.close();

	}

}