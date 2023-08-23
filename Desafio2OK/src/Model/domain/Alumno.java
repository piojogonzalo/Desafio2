package Model.domain;

/*  -Para cada alumno se deberá ingresar los siguientes datos:
 *  - nombre (string)
 *  - apellido (string
 *  - número de examen     
 *  - nota que obtuvo el alumno (numérico >=0 <=10)
 * 
 */

public class Alumno {
	
	public String Nombre;
	public String Apellido;
	public int NumeroExamen;
	public Double Nota;
	
	public Alumno(String Nombre, String Apellido, int NumeroExamen, Double nota) {
		super();
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.NumeroExamen = NumeroExamen;
		this.Nota = nota;
	
	}
	
	

}
