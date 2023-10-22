package Java_prueba.Controladores;

import java.util.Scanner;

import Java_prueba.Servicios.MenuImplementacion;
import Java_prueba.Servicios.MenuInterfaz;
import Java_prueba.Servicios.RegistroImplementacion;
import Java_prueba.Servicios.RegistroInterfaz;
import Java_prueba.Servicios.OperacionImplementacion;
import Java_prueba.Servicios.OperacionInterfaz;


/**
 * Clase principal, por donde se accede a la aplicacion
 * 211023
 *@author msm
 */
public class Inicio{
	/**
	 * Metodo principal de la aplicaicon, donde contendra el procedimiento de la aplicacion
	 * 211023
	 * @author msm
	 */
	public static void main(String[] args) {
		
	//Objetos
		MenuInterfaz mi  = new MenuImplementacion();
		OperacionInterfaz op = new OperacionImplementacion();
		RegistroInterfaz rg = new RegistroImplementacion();
		
	//variables
		boolean cerrarMenu = false;
		int opcionSeleccionada;
		Scanner comunicacionTeclado = new Scanner(System.in);
		
	//while and switch
		while (!cerrarMenu) {
			
			opcionSeleccionada = mi.mostrarMenuYRespuesta(comunicacionTeclado);
			
			switch (opcionSeleccionada) {
				
				case 0:
					cerrarMenu = true;
					break;
				case 1:					
					System.out.println("Abriendo inicio");
					rg.recogerDatos(comunicacionTeclado);
					break;
				case 2:
					System.out.println("Abriendo suma ");
					op.suma(comunicacionTeclado);
					break;
				case 3:
					System.out.println("Abriendo resta");
					op.resta(comunicacionTeclado);
					break;
				case 4:
					System.out.println("Abriendo multiplicacion");
					op.multiplicacion(comunicacionTeclado);
					break;
				case 5:
					System.out.println("Abriendo division");
					op.division(comunicacionTeclado);
					break;
				}
			}
		}
	}