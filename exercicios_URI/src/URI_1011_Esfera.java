import java.util.Scanner;

public class URI_1011_Esfera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio, volume;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
		
		volume = (4.0 / 3) * pi * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f\n", volume);
		
	}
	
}
