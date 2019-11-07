import java.io.IOException;
import java.util.Scanner;

public class URI_1017_Gasto_de_Combustivel {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int tempo, vm; 
		double distancia, consumo;
		
		tempo = sc.nextInt();
		vm    = sc.nextInt();
				
		distancia = tempo * vm;
		consumo = distancia / 12;
		
		System.out.printf("%.3f\n", consumo);
		
		sc.close();
		
	}
}
