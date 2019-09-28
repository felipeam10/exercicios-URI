import java.util.Scanner;

public class URI_1012_Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.141519;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangulo = (a * c) / 2.0;
		circulo = pi * c * c;
		trapezio = (c * (a + b))/ 2;
		quadrado = Math.pow(b, 2);
		retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", 	triangulo);
		System.out.printf("CIRCULO: %.3f\n", 	circulo);
		System.out.printf("TRAPEZIO: %.3f\n", 	trapezio);
		System.out.printf("QUADRADO: %.3f\n", 	quadrado);
		System.out.printf("RETANGULO: %.3f\n",	retangulo);
		
		sc.close();
	}
}
