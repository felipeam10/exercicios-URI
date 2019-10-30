import java.io.IOException;
import java.util.Scanner;

public class URI_1015_Dist_Entre_Dois_Pontos {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		float x1, x2, y1, y2, p1, p2, distancia, raiz;
		
		x1 = sc.nextFloat();
		y1 = sc.nextFloat();
		x2 = sc.nextFloat(); 
		y2 = sc.nextFloat();
		
		p1 = x2-x1;
		p2 = y2-y1;
		
		distancia = ((float) Math.pow(p1, 2) + (float) Math.pow(p2, 2));
		raiz = (float) Math.sqrt(distancia);
		
		System.out.printf("%.4f\n", raiz);
		
		sc.close();
		
	}
}