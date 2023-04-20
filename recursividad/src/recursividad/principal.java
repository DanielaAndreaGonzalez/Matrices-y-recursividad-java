/**
 * 
 */
package recursividad;

import java.util.Scanner;



/**
 * @author GonzalezHDanielaA
 *
 */
public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		funcion unir  = new funcion();
		
		unir.generar(1);
		
		int resultado = unir.factorial(4);		
		System.out.println("Factorial: "+resultado);
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tabla de multiplicar a generar");
		int num = entrada.nextInt();
		multiplicar(num,10);
		
		
	
	}
	
		
	public static void multiplicar(int TABLA, int LONGITUD)
	{
		if(LONGITUD>1) {
			multiplicar(TABLA, LONGITUD-1);
		}
		
		System.out.printf("%d x %d = %d \n",TABLA,LONGITUD,(TABLA*LONGITUD));
	}

}
