import java.io.IOException;
import java.util.Scanner;

public class URI_1014_Consumo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int x;
		double y, media;
		
		
		x = sc.nextInt();
		y = sc.nextDouble();
				
		media = x/y;
		
		System.out.printf("%.3f km/l\n", media);
		
		sc.close();
		
	}
}
