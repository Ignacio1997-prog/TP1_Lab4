package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado(1,"Manuel");
		Empleado emp2 = new Empleado("Sofia",3);
		Empleado emp3 = new Empleado();
		
		System.out.println(emp1.toStringTodo());
		System.out.println(emp2.toStringTodo());
		System.out.println(emp3.toStringTodo());
		return;
	}

}
