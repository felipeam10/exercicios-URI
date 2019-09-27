import java.util.Scanner;

public class URI_1008_Salario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int Numero, QtdHoras; 
		double VlrHora, Salario;
		
		Numero = sc.nextInt();
		QtdHoras = sc.nextInt();
		VlrHora = sc.nextDouble();
		
		Salario = QtdHoras * VlrHora;
				
		
		System.out.printf("NUMBER = %d\n", Numero);
		System.out.printf("SALARY = U$ %.2f\n", Salario);
		
	}
}
