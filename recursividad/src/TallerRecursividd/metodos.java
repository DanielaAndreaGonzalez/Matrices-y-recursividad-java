/**
 * 
 */
package TallerRecursividd;

/**
 * @author GonzalezHDanielaA
 *
 */
public class metodos {
	
	
	//1. Imprimir digitos desde N hasta 1 (decreciente)
	

	public void generarDecreciente(int n)
	{
		if(n >=1)
		{
			System.out.print(n + "-");
			
			generarDecreciente(n-1);
		}
		
	}

	//2. Elevar un número(base) a la potencia indicada
	public int generarPotencia(int base,int potencia,int contador)
	{
		
		int resultado = base;
		if(contador < potencia)
		{
			resultado  = resultado * generarPotencia(base,potencia,contador+1);;
			return resultado;
		}	
		return base;
	}
	
	
	public int potencia(int base,int potencia)
	{
		if(potencia==0) return 0;
		else if(potencia==1) return base;
		else return base * potencia(base,potencia-1);
	}
	
	
	// 3. Recorrer y mostrar array ingresado
	public void mostrarArrayIngresado(int [] array,int indice)
	{
		if(indice <= array.length-1)
		{
			System.out.println(array[indice] + " ");
			mostrarArrayIngresado(array,indice+1);
		}		
	}
	
	//4. Encontrar mayor en un arreglo
	public int encontrarMayorRecursivo(int array[],int indice, int mayor)
	{
		if(indice <= array.length-1)
		{
			if(array[indice] > mayor)
			{
				mayor = array[indice];
				
			}	
			return encontrarMayorRecursivo(array, indice+1, mayor);
		}
		return mayor;
	}
	
	//5.0 Encontrar menor en un arreglo
	public int encontrarMenor(int array[], int indice, int menor)
	{
		
		if(indice <= array.length-1)
		{
			if(array[indice] < menor)
			{
				menor = array[indice];
				
			}	
			return encontrarMenor(array, indice+1, menor);
		}
		return menor;
	}
	
	//Imprimir matriz
	
	public static void recorrerMatriz(int[][] matriz, int i, int j)
	{	
		System.out.print(matriz[i][j] + " ");
		if(i != matriz.length - 1 || j != matriz[i].length - 1)
		{
			if(j == matriz[i].length-1)
			{
				i++;
				j = 0;
				System.out.println(" ");
			}
			else
			{
				j++;
			}	
			recorrerMatriz(matriz, i, j);
		}	
	}
	//Sacar mayor de una matriz
	public static int ObtenerMayorMatriz(int[][] matriz, int i, int j,int mayor)
	{	
		System.out.print(matriz[i][j] + " ");
		
		if(i != matriz.length - 1 || j != matriz[i].length - 1)
		{
			if(matriz[i][j]>mayor)
			{
				mayor=matriz[i][j];	
			}
			if(j == matriz[i].length-1)
			{
				i++;
				j = 0;
				System.out.println(" ");
			}
			else
			{
				j++;
			}	
			mayor = ObtenerMayorMatriz(matriz, i, j, mayor);
			
		}	
		return mayor;
	}
	//Obtener menor de una matriz 
	public static int ObtenerMenorMatriz(int[][] matriz, int i, int j,int menor)
	{	
		System.out.print(matriz[i][j] + " ");
		
		if(i != matriz.length - 1 || j != matriz[i].length - 1)
		{
			if(matriz[i][j]<menor)
			{
				menor=matriz[i][j];	
			}
			if(j == matriz[i].length-1)
			{
				i++;
				j = 0;
				System.out.println(" ");
			}
			else
			{
				j++;
			}	
			menor = ObtenerMenorMatriz(matriz, i, j, menor);		
		}	
		return menor;
	}
	
	
}
