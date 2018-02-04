
package examenparcial;

import java.util.Scanner;

public class Alumnos {
    
    	public static void main(String[] args) {
            
		Scanner s = new Scanner(System.in);
		String[] nombre = new String[5];
		int[] nota1 = new int[5];
		int[] nota2 = new int[5];
		int[] nota3 = new int[5];
		int[] edad = new int[5];
		String[] sexo = new String[5];
		int a=0,resp1;
		do{
			do{
		System.out.println("Para Registro de AlumnoSeleccione la opcion 1:");
		resp1 = s.nextInt();
			}while(resp1<1||resp1>3);
		
		if(resp1==1){
			if(a==5){
				System.out.println("Máximo de alumnos registrados");
			}
			do{
			System.out.print("Ingrese el nombre del alumno "+(a+1)+": ");
			nombre[a] = s.next();
			System.out.print("Ingrese la edad del alumno "+(a+1)+": ");
			edad[a] = s.nextInt();
			System.out.print("Ingrese sexo del alumno "+(a+1)+": ");
			sexo[a] = s.next();
			System.out.print("Ingrese la nota 1 del alumno "+(a+1)+": ");
			nota1[a] = s.nextInt();
			System.out.print("Ingrese la nota 2 del alumno "+(a+1)+": ");
			nota2[a] = s.nextInt();
			System.out.print("Ingrese la nota 3 del alumno "+(a+1)+": ");
			nota3[a] = s.nextInt();			
			a++;
			do{
			System.out.println("¿Desea registrar un nuevo alumno?");
			System.out.println("1:SI");
			System.out.println("2: NO");
			}while(resp1<1||resp1>2);
			resp1 = s.nextInt();
			}while(resp1==1);
		}		
		if(resp1==3){			
		}		
		}while(resp1==1);
        
	}

}
