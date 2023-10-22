package Java_prueba.Servicios;

import java.util.Scanner;

/*
 * Implementacion de los metodos, donde se especifica la logica de las operaciones
 * 21/1023
 * @author msm
 */

public class OperacionImplementacion implements OperacionInterfaz {
	

	public void suma (Scanner comunicadoTeclado) {
		
		System.out.println("Dame el primer numero");
		double n1 = comunicadoTeclado.nextDouble();
		System.out.println("Dame el segundo numero");
		double n2 = comunicadoTeclado.nextDouble();
		System.out.println("");
		System.out.println("Resultado:");
		System.out.println( n1 + n2);

	}
	
	public void resta (Scanner comunicadoTeclado) {
		System.out.println("Dame el primer numero");
		double n1 = comunicadoTeclado.nextDouble();
		System.out.println("Dame el segundo numero");
		double n2 = comunicadoTeclado.nextDouble();
		System.out.println("");
		System.out.println("Resultado:");
		System.out.println( n1 - n2);
	}
	
	
	public void multiplicacion (Scanner comunicadoTeclado) {
		System.out.println("Dame el primer numero");
		double n1 = comunicadoTeclado.nextDouble();
		System.out.println("Dame el segundo numero");
		double n2 = comunicadoTeclado.nextDouble();
		System.out.println("");
		System.out.println("Resultado:");
		System.out.println( n1 * n2);
	}
	
	public void division (Scanner comunicadoTeclado) {
		System.out.println("Dame el primer numero");
		double n1 = comunicadoTeclado.nextDouble();
		System.out.println("Dame el segundo numero");
		double n2 = comunicadoTeclado.nextDouble();
		System.out.println("");
		System.out.println("Resultado:");
		System.out.println( n1 / n2);
	}
}


