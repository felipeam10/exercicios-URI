import java.io.IOException;
import java.util.Scanner;

public class URI_1016_Distancia {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int dist;
		
		dist = sc.nextInt();

		int tempo = (int) (dist / ((90/60.0) - (60/60.0)));
		
		System.out.printf("%d minutos\n", tempo);
		
		sc.close();
		
	}
}