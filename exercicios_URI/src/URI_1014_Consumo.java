import java.io.IOException;
import java.util.Scanner;

public class URI_1014_Consumo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int x;
		float y, media;
		
		
		x = sc.nextInt();
		y = sc.nextFloat();
				
		media = x/y;
		
		System.out.printf("%.3f km/l", media);
		
		sc.close();
		
	}
}
