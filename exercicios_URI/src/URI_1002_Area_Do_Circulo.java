/*
public class URI_1002_Area_Do_Circulo {
	
	public static void main(String[] args) {
		
		double area;
		double raio = 100.64;
		double pi = 3.14159;
		
		raio = Math.pow(raio, 2);
		area = pi * raio;
		
		System.out.printf("A=%.4f\n", area);
	}

}
*/


import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class URI_1002_Area_Do_Circulo {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double area, raio, pi = (3.14159);
		raio = sc.nextDouble();
		raio = Math.pow(raio,2.0);
		area = pi*raio;
		
		System.out.printf("A=%.4f\n", area);
		
		sc.close();
	}
}