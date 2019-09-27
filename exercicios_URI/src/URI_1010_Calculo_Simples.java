import java.util.Scanner;

public class URI_1010_Calculo_Simples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double vlrUnitPeca1, vlrUnitPeca2, totalPecas;
		
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		vlrUnitPeca1 = sc.nextDouble();
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		vlrUnitPeca2 = sc.nextDouble();
		
		totalPecas = (numPeca1 * vlrUnitPeca1) + (numPeca2 * vlrUnitPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPecas);
		
		sc.close();
		
	}
}
