package main;
import java.util.Scanner;
import Model.domain.Alumno;

/*  -Para cada alumno se deberá ingresar los siguientes datos:
 *  - nombre (string)
 *  - apellido (string)
 *  - número de examen     
 *  - nota que obtuvo el alumno (numérico >=0 <=10)
 * 
 */

public class Principal {

	public static void main(String[] args) {
		
		Alumno [] Alumnos = new Alumno [2];
		Scanner scanner = new Scanner(System.in);
		int contadorAlumnos = 0;
		int notaMasBaja = 0;
		int notaMasAlta = 10;
		int opcion;
	
			do {
			System.out.println(" -- Ingrese una opcion -- ");
			System.out.println("1- Alumno ");
			System.out.println("2- Apellido: ");
			System.out.println("3- Número de examen ");
			System.out.println("4- Nota ");
			System.out.println("5- Nota más alta de la clase");
			opcion = scanner.nextInt();
			//double Nota = scanner.nextDouble(); borrar en caso que este bien --------
			
			
				switch (opcion) {
					case 1:{
						if (contadorAlumnos<Alumnos.length) {
							System.out.println("Ingrese el nombre del Alumno: ");
							String nombre = scanner.next();
							System.out.println("Ingrese el Apellido: ");
							String Apellido = scanner.next();
							System.out.println("Ingrese el número del examen: ");
							int NumeroExamen = scanner.nextInt();
							System.out.println("Ingrese la nota: ");
							int Nota = scanner.nextInt();
							//System.out.println("LA nota mas alta es: "); borrar en caso que este bien --------
							Alumnos [contadorAlumnos] = new Alumno ( nombre, Apellido, NumeroExamen, Nota);
							contadorAlumnos++;
						    
						}else {
							System.out.println("No se pueden agregar alumnos");
						} 
								
	   break;
						
					}			
					
			}
		
				} while (opcion!=5);
							
							for (int i=0; i < notaMasBaja ; i++ ) {
						    System.out.println("la nota mas baja fue:" + (notaMasBaja) );
						     notaMasBaja = scanner.nextInt();
					     if (i==0) {
						    	 notaMasBaja = notaMasAlta;
						     } else if (notaMasAlta < notaMasBaja) {
						    	 notaMasBaja=notaMasAlta;
						     }
					}	System.out.println("La nota mas alta es: " + notaMasAlta);
	}

}
