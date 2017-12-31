/**
* Ejercicio conversor de graods celsius 
* 
* @author  Adán García Santos
* @version 1.0
* @since   31-12-2017
*/

package com.cip.prog;
import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		Scanner sc_grados = new Scanner(System.in);	//Se crea lector de grados
		
		System.out.print("Grados a convertir: ");	//Mensaje para introducir datos
		double grados = sc_grados.nextDouble();		//Se almacenan datos de entrada en variable "grados"
		
		double calculoF = (9.0/5.0) * grados + 32;	//Se realiza el calculo de conversión
		System.out.println(grados + 
				" grados Centígrados equivalen a " + calculoF + " grados Fahrenheit");
		
		sc_grados.close();	//Cerrar lector de grados

	}

}
