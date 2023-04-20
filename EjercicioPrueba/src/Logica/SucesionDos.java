package Logica;
import java.util.*;
import java.io.*;
public class SucesionDos {
	
	public static void main(String [] args)
	{
		 Scanner in = new Scanner(System.in);
		  int N = Integer.parseInt(in.nextLine());

		    for (int i = 0; i < N; i++) {
		        String arr[] = in.nextLine().split(" ");
		        int arr2[] = new int[3];

		        for (int j = 0; j < 3; j++) {
		            int value = Integer.parseInt(arr[j]);
		            arr2[j] = value;
		        }

		        int n = arr2[0];
		        n += (int) Math.pow(2, 0) * arr2[1];
		        String s = n + "";
		        for (int j = 1; j < arr2[2]; j++) {
		            int value = (int) Math.pow(2, j) * arr2[1];
		            n += value;
		            s = s + " " + n;
		        }
		        System.out.println(s);
		    }

		    in.close();
	}

}
