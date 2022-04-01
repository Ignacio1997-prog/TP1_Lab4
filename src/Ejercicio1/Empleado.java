package Ejercicio1;

public class Empleado {
	
	private final int id;
	private String nombre;
	private int edad;
	private static int cont=1000;
	
	public Empleado() {
		id = cont;
		nombre = "Sin Nombre";
		edad = 99;
		cont++;
	}
	
	public Empleado(int e , String nom) {
		id=cont;
		edad = e;
		nombre = nom;
		cont++;
	}
	
	public Empleado(String nom,int e ) {
		id=cont;
		edad = e;
		nombre = nom;
		cont++;
	}
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Empleado " + nombre + ", edad:" + edad + ", legajo:" + id;
	}
	
	public String devuelveProximoID() {
		return "Proximo ID:" + cont;
	}
}



