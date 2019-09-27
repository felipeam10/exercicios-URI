
/*
public class URI_1003_Soma_Simples {

	public static void main(String[] args) {
		
		int A = 10;
		int B = 30;
		
		System.out.println("SOMA = "  + (A+B) );
	}
	
}
*/
import java.io.IOException;
import java.util.Scanner;

public class URI_1003_Soma_Simples {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		int A, B, SOMA;

		A = sc.nextInt();
		B = sc.nextInt();

		SOMA = A + B;

		System.out.println("SOMA = " + SOMA);

		sc.close();
	}

}