/**
 * 
 */
package TallerRecursividd;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Principal {
	
	
	public static void main(String args [])
	{
		
		metodos metodos = new metodos();
		
		//metodos.generarDecreciente(10);
		
		//System.out.println(metodos.generarPotencia(6, 3, 1));
		
		int array [] = {3,20,1,500,10};
		//metodos.mostrarArrayIngresado(array, 0);
		
		//System.out.println(metodos.encontrarMayorRecursivo(array, 0, 0));
		//System.out.println(metodos.encontrarMenor(array, 0, 999));
		int matriz[][] = {{8,5,4,6,7},
						  {8,20,7,9,10},
						  {6,11,2,9,4}};
				
		
		
		//metodos.recorrerMatriz(matriz, 0, 0);
		System.out.println(" mayor" +metodos.ObtenerMayorMatriz(matriz, 0, 0, 0));
		 
		System.out.println(" menor "+metodos.ObtenerMenorMatriz(matriz, 0, 0, 9999));
		
	}

}
