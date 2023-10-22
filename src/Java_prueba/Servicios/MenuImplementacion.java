package Java_prueba.Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {
	
	public int mostrarMenuYRespuesta(Scanner comunicacionTeclado) {
		
		int respuestaAlmacenada;
		
		System.out.println("#######################");
		System.out.println("0 [] Cerrar Menu");
		System.out.println("1 [] Iniciar Sesión");
		System.out.println("2 [] Sumar");
		System.out.println("3 [] Restar");
		System.out.println("4 [] Multiplicar");
		System.out.println("5 [] Dividir");
		
		
		respuestaAlmacenada = comunicacionTeclado.nextInt();
		
		return respuestaAlmacenada;
	}

}
