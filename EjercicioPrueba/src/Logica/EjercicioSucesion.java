package Logica;

import java.util.Iterator;

public class EjercicioSucesion {
/*
 * Realizar una función que reciba dos parametros enteros 
 * x y Y y n. n es la cantidad de veces que se mostrará el número o que se repita la sucesión 
 * X debe de aumentar cuatro cifras mientras que Y debe de disminuir cuatro cifras
 * se debe de imprimir el valor de x y luego el valor de Y 
 * 
 */
	public static void main(String[] args) {
		
		int x=11;
		int y=12;
		sucesion(x, y, 5);
	}
	
	//12;11;13;10;14;9;15;8;16;7;17;6;
	public static void sucesion(int x, int y, int n)
	{
		for(int i=0; i<=n;i++)
		{
			x+=1;
			System.out.print(x);
			System.out.print(";");
			y=y-1;
			System.out.print(y);
			System.out.print(";");
		}
	}
	
	

}
