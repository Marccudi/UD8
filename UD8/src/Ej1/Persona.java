package Ej1;

public class Persona {
	public String nombre=null;
	public int edad=0;
	public String DNI=null;
	public char sexo='h';
	public Double peso=0.0;
	public Double altura=0.0;
	
	
	public Persona() {
		
	}

	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, String dNI, char sexo, Double peso, Double altura) {
		this.nombre = nombre;
		this.edad = edad;
		DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	
	
}

