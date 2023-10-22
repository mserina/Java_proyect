package Java_prueba.Servicios;

import java.util.Scanner;

/*
 * Almacena la cabezera de los metodos
 * 21/10/2023
 * @author msm
 */

public interface OperacionInterfaz {
	
	//Metodo suma
	public void suma (Scanner comunicadoTeclado);
	
	//Metodo resta
	public void resta (Scanner comunicadoTeclado);
	
	//Metodo multiplicacion
	public void multiplicacion (Scanner comunicadoTeclado);
	
	//Metodo division
	public void division (Scanner comunicadoTeclado);

}
