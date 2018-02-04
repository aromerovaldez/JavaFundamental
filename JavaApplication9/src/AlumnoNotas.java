
package examenparcial;

import java.util.Scanner;
import java.text.*;

public class AlumnoNotas {
 
	public static void main(String[] args)
	{
		Scanner obtener = new Scanner(System.in);
		int estudiantes,i,notaMayor,notaMenor,nota,sumaNotas;
                
                System.out.print("Ingrese numero de estudiantes: ");
		estudiantes = obtener.nextInt();
                
                int n1,n2,n3,suma, promedio;
                System.out.print("Ingrese nota 1: ");
                n1=obtener.nextInt();
                System.out.print("Ingrese nota 2: ");
                n2=obtener.nextInt();
                System.out.print("Ingrese nota 3: ");
                n3=obtener.nextInt();
                suma=(n1+n2+n3);
                promedio = (suma/3) ; 
      if (promedio > 13) { 
       System.out.println ("Es el mayor promedio es: " +promedio ) ; 
} 
      else { 
       System.out.println ("Es el menor promedio es: " +promedio ) ; 
} 

		
                notaMayor = 15;
		notaMenor = 10;
		sumaNotas = 0;
 
		for(i = 1; i <= estudiantes; i++)
		{
			System.out.print("Ingrese la nota para el estudiante: " + i + " : ");
			nota = obtener.nextInt();
 
			sumaNotas = sumaNotas + nota;
			if(nota > notaMayor)
			{
				notaMayor=nota;
			}
			if(nota < notaMenor)
			{
				notaMenor=nota;
			}
		}
 
		System.out.print("La nota mayor es: " + notaMayor + "\n");
		System.out.print("La nota menor es: " + notaMenor + "\n");
 
		//System.out.print("El promedio es: " + df.format((double)sumaNotas/3) + "\n");
                System.out.print("El promedio es: " + ((double)sumaNotas/estudiantes) + "\n");
               
	}
}

