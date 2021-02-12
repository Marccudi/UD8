package Ej1;

public class UD8ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pruebas clase Persona
		Persona p1=new Persona();
		System.out.println(p1.nombre);

		Persona p2=new Persona("Marc", 23, 'h');
		System.out.println(p2.nombre);

		
		Persona p3=new Persona("Marc",23,"48003310X", 'h', 100.0 ,1.75);
		System.out.println(p3.peso);

		
		
	}

}
