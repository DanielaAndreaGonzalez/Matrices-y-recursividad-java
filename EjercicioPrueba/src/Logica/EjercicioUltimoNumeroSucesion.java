package Logica;



public class EjercicioUltimoNumeroSucesion {

	/*
	 * Realizar un programa que realice la siguiente sucesión 
	 * e imprima los digitos de la siguiente manera encontrando el último digito de la
	 * fila 8 
	 * 
	 * 1 fila = 10
	 * 2 fila = 11 13
	 * 3 fila = 14 16 18
	 * 4 fila = 19 21 23 25
	 * 5 fila = 26 28 30 32 34
	 * 6 fila = 35 37 39 41 43 45
	 * 7 fila = 46 48 50 52 54 56 58
	 * 8 fila = 59 61 63 65 67 69 71 73  
	 */
	public static void main(String[] args) {
		
		
		imprimirPiramide(8, 10);

	}
	
	public static void imprimirPiramide(int n,int inicio)
	{
		int acu=1;
		for(int i=1; i<=n;i++)
		{
			//System.out.println(i+" fila "+inicio);
			for(int j=1; j<=i;j++)
			{
				if(acu == i)
				{
					System.out.println(i+" fila °"+inicio);
					System.out.println(" ");
					inicio+=1;
					acu = 1;
				}
				else {
					System.out.print(i+" fila °"+inicio);
					inicio+=2;
					System.out.print(" ");
					acu++;	
				}
			}
			
			
			
		}
		
		
	}
	
	
	
	

}
