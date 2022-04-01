package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado(30,"Manuel");
		Empleado emp2 = new Empleado("Sofia",28);
		Empleado emp3 = new Empleado(22,"Tomas");
		
		Empleado emp4 = new Empleado();
		emp4.setEdad(25);
		emp4.setNombre("Jose");
		Empleado emp5 = new Empleado();
		emp5.setNombre("Camila");
		emp5.setEdad(33);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		System.out.println(emp5.toString());
		
		System.out.println(emp1.devuelveProximoID());
		
		return;
	}

}
