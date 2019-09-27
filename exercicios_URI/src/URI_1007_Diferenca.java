import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class URI_1007_Diferenca {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int A,B,C,D,Diferenca;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		Diferenca = (A*B)-(C*D);

		System.out.printf("DIFERENCA = " + Diferenca);
		
		sc.close();

	}

}