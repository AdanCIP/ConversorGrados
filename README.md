# Práctica UT03 - Conversor grados centígrados a grados Fahrengeit

##Objetivo

El objetivo de esta práctica es el de desarrollar un pequeño programa que permita convertir grados centígrados en grados fahrenheit.

##Desarrollo

Para el desarrollo de esta práctica he dividio el problema en dos partes:

*Lectura de grados centigrados a través de teclado.
*Tipo de variable utilizada para el almacenamiento de los grados a convertir.

Para la lectura de los grados centígrados se ha utilizado la clase Scanner, por otro lado para almacenar estos grados he decidido por utilizar una variable de tipo double y así poder obtener y convertir grados dados con decimales (Ej.: "10.5 grados centígrados).

```bash
Scanner sc_grados = new Scanner(System.in);	//Se crea lector de grados
double grados = sc_grados.nextDouble();		//Se almacenan datos de entrada en variable "grados"
```

> __Nota__: Estas líneas de código corresponden a las líneas 16 y 19 del programa.



