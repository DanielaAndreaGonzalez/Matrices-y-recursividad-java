/**
 * 
 */
package recursividad;

/**
 * @author GonzalezHDanielaA
 *
 */
public class funcion {
	
	
	 
	public void generar(int x)
	{
		if(x<=10)
		{
			System.out.print(x + " ");
			
			generar(x+1);
		}
	}
	
	//Retorna porque es un dato total
	public int factorial(int x)
	{
		int tFactorial =0;
		
		if(x>=1)
		{
			tFactorial = x*factorial(x-1);
			return tFactorial;
		}
		
		return 1;
	}
	
	
	
	
	
	

}
