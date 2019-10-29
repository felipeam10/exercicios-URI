import java.io.IOException;
import java.util.Scanner;

public class URI_1013_oMaior {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		int maiorAB, maiorABC;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maiorAB = (a + b + Math.abs(a-b))/2;
		maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		
		System.out.printf("%d eh o maior\n", maiorABC);
		
		sc.close();
	}
}
