package Java_prueba.Servicios;

import java.util.Scanner;

/*
 * Implementacion de los metodos, donde se especifica la logica
 * 21/1023
 * @author msm
 */

public class RegistroImplementacion implements RegistroInterfaz	 {

	public void recogerDatos(Scanner comunicacionTeclado) {
		
		System.out.println("#############################");
		System.out.println("Inserte sus datos");
		System.out.println(" ");
		System.out.println("Inserte Nombre");
		String nombre = comunicacionTeclado.next();
		System.out.println("Inserte Edad");
		int edad = comunicacionTeclado.nextInt();
		System.out.println("Inserte Sexo");
		char sexo = comunicacionTeclado.next().charAt(0);
		System.out.println("Inserte Altura");
		double altura = comunicacionTeclado.nextDouble();
		System.out.println("Guardando: Nombre: " + nombre + " || Edad: " + edad + " || Sexo: " + sexo + "|| Altura: " + altura);

	}
}
