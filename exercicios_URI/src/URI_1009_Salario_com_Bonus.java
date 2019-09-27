import java.util.Scanner;

public class URI_1009_Salario_com_Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario, vendas, total;
		
		nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		
		total = (vendas * 0.15) + salario;
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
		
		sc.close();
	}
	
}
