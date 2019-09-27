import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class URI_1006_Media2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		double A, B,C, Media;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		Media = ((A*2) + (B*3) + (C*5))/10;

		System.out.printf("MEDIA = %.1f\n", Media);

		sc.close();

	}

}