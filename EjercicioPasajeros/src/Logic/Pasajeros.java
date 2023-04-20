/**
 * 
 */
package Logic;

import javax.swing.JOptionPane;



/**
 * @author GonzalezHDanielaA
 *
 */
public class Pasajeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int pasajeros[][] = new int[6][5];
		
		String cadena = " ";
		String cadena2= " ";
		
		int mayorBus0 =0;
		int mayorBus1 = 0;
		int mayorBus2 = 0;
		int mayorBus3=0;
		int mayorBus4 = 0;
		
		int menorBus0 = 999;
		int menorBus1= 999;
		int menorBus2= 999;
		int menorBus3 =999;
		int menorBus4 = 999;
		
		int dia =0;
		int dia2 =0;
		int dia3 =0;
		int dia4 =0;
		int dia5 = 0;
		
		int diaMenor0=0;
		int diaMenor1 =0 ;
		int diaMenor2 =0;
		int diaMenor3 =0;
		int diaMenor4 =0;
		int diaMenor5 = 0;
		
		
		int codigo0 = 0;
		int codigo1= 0;
		int codigo2 =0;
		int codigo3 =0;
		int codigo4=0;
		
		String diaEscrito = "";
		String diaEscrito2 = "";
		String diaEscrito3 = "";
		String diaEscrito4 = "";
		String diaEscrito5 = " ";
		
		String diaEscritoMenor0 = " ",
				diaEscritoMenor1 = " ",
				diaEscritoMenor2 = "",
				diaEscritoMenor3 = "",
				diaEscritoMenor4 = "";
		
		for(int i=0; i< pasajeros.length;i++)
		{
			for(int j=0; j<pasajeros[i].length; j++)
			{
				if(i==0)
				{
					pasajeros[0][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del bus "));
				}
				
				if(i==1)
				{
						pasajeros[1][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  número de pasajeros para el día lunes del bus "+j));
				}
				
				if(i==2)
				{
						pasajeros[2][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  número de pasajeros para el día martes del bus "+j));
				}
				if(i==3)
				{
						pasajeros[3][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  número de pasajeros para el día miércoles del bus "+j));
				}
				if(i==4)
				{
						pasajeros[4][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  número de pasajeros para el día jueves del bus "+j));
				}
				if(i==5)
				{
						pasajeros[5][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  número de pasajeros para el día viernes del bus "+j));
				}
				
			}
		}
		
		for(int i = 0; i < pasajeros.length; i++){ 
			if(i==0)
				System.out.print("Código ");
			if(i==1)
				System.out.print("Lunes ");
			if(i==2)
				System.out.print("Martes ");
			if(i==3)
				System.out.print("Miercoles ");
			if(i==4)
				System.out.print("Jueves ");
			if(i==5)
				System.out.print("Viernes ");
			for(int j = 0; j < pasajeros[i].length; j++){ 
				System.out.print(pasajeros[i][j] + " ");	// Imprime elemento	
				
			}
		// Imprime salto de línea
			System.out.println();	// Imprime salto de línea	
		} 
		//For para sacar el mayor 
		for(int i=0; i<=5;i++) {	
			
			
			if(pasajeros[i][0] > mayorBus0 ) {
				mayorBus0 = pasajeros[i][0];
				dia = i;
				codigo0 = pasajeros[0][0];
			}
				
			
			if(pasajeros[i][1] > mayorBus1)
			{
				mayorBus1 = pasajeros[i][1];
				dia2= i;
				codigo1 = pasajeros[0][1];
			}
			
			
			if(pasajeros[i][2] >mayorBus2)
			{
				mayorBus2 = pasajeros[i][2];
				dia3 = i;
				codigo2 = pasajeros[0][2];
			}

			
			if(pasajeros[i][3] > mayorBus3)
			{
				mayorBus3 = pasajeros[i][3];
				dia4 = i;
				codigo3 = pasajeros[0][3];
			}
			
			 	
			if(pasajeros[i][4] > mayorBus4)
			{
				mayorBus4 = pasajeros[i][4];
				dia5 = i;
				codigo4 = pasajeros[0][4];
			}			
		}
		
		//Para sacar el menor
		for(int i=1; i<=5;i++) {
			
			if(pasajeros[i][0] < menorBus0)
			{
				menorBus0 =  pasajeros[i][0];
				diaMenor0 = i;
				codigo0 = pasajeros[0][0];
			}
			
			if(pasajeros[i][1] < menorBus1)
			{
				menorBus1 = pasajeros[i][1];
				diaMenor1= i;
				codigo1 = pasajeros[0][1];
			}
			
			if(pasajeros[i][2] < menorBus2)
			{
				menorBus2 = pasajeros[i][2];
				diaMenor2 = i;
				codigo2 = pasajeros[0][2];
			}
			if(pasajeros[i][3] < menorBus3)
			{
				menorBus3 = pasajeros[i][3];
				diaMenor3 = i;
				codigo3 = pasajeros[0][3];
			}
			if(pasajeros[i][4] < menorBus4)
			{
				menorBus4 = pasajeros[i][4];
				diaMenor4 = i;
				codigo4 = pasajeros[0][4];
			}
			
		}
		
		diaEscrito = sacarDia(dia);
		diaEscrito2 = sacarDia(dia2);
		diaEscrito3 = sacarDia(dia3);
		diaEscrito4 = sacarDia(dia4);
		diaEscrito5 = sacarDia(dia5);
		
		diaEscritoMenor0 = sacarDia(diaMenor0);
		diaEscritoMenor1 = sacarDia(diaMenor1);
		diaEscritoMenor2 = sacarDia(diaMenor2);
		diaEscritoMenor3 = sacarDia(diaMenor3);
		diaEscritoMenor4 = sacarDia(diaMenor4);
	
		cadena += "El dia que más pasajeros llevó el bus 1 - Código:"+codigo0+" fue el día "+diaEscrito+" con "+mayorBus0+ " pasajeros" + "\n";
		cadena += "El dia que más pasajeros llevó el bus 2 - Código: " +codigo1 +" fue el día "+diaEscrito2+" con "+mayorBus1+ " pasajeros" + "\n";
		cadena += "El dia que más pasajeros llevó el bus 3 - Código: " +codigo2 +" fue el día "+diaEscrito3+" con "+mayorBus2+ " pasajeros"+ "\n";
		cadena += "El dia que más pasajeros llevó el bus 4 - Código: "+codigo3 + " fue el día "+diaEscrito4+ " con "+mayorBus3 + " pasajeros "+ "\n";
		cadena += "El dia que más pasajeros llevó el bus 5 - Código: "+codigo4 + " fue el día "+diaEscrito5+ " con "+mayorBus4 + " pasajeros "+ "\n";
		
		cadena2 += "El dia que menos pasajeros llevó el bus 1 - Código: "+codigo0 + " fue el día "+diaEscritoMenor0+ " con "+menorBus0 + " pasajeros "+ "\n";
		cadena2 += "El dia que menos pasajeros llevó el bus 2 - Código: "+codigo1 + " fue el día "+diaEscritoMenor1+ " con "+menorBus1 + " pasajeros "+ "\n";
		cadena2 += "El dia que menos pasajeros llevó el bus 3 - Código: "+codigo2 + " fue el día "+diaEscritoMenor2+ " con "+menorBus2 + " pasajeros "+ "\n";
		cadena2 += "El dia que menos pasajeros llevó el bus 4 - Código: "+codigo3 + " fue el día "+diaEscritoMenor3+ " con "+menorBus3 + " pasajeros "+ "\n";
		cadena2 += "El dia que menos pasajeros llevó el bus 5 - Código: "+codigo4 + " fue el día "+diaEscritoMenor4+ " con "+menorBus4 + " pasajeros "+ "\n";
		
		System.out.println("\n");
		System.out.println(cadena);
		System.out.println(cadena2);
	}
	
	public static String sacarDia(int entero)
	{
		
		String dia = " ";
		switch(entero)
		{
		case 1:	
			dia= "Lunes";
			break;
		case 2:
			dia="Martes";
			break;
		case 3:
			dia="Miercoles";
			break;
		case 4:
			dia="Jueves";
			break;
		case 5:
			dia="Viernes";
			break;
		default:
			System.out.println("opcion invalida");	
		}
		return dia;
	}

}
