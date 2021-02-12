package Ej3;

public class Electrodomestico {
	public double precioBase;
	public String color;
	public char consumoEnergetico;
	public double peso;
	
	public final double PRECIOBASE_DEF=100;
	public final String COLOR_DEF="blanco";
	public final char CONSUMO_DEF='F';
	public final double PESO_DEF=5;
	
	public final String arrayColores[]= {"blanco","negro","rojo","azul","gris"};
	public final char arrayConsumo[]= {'A','B','C','D','E','F','a','b','c','d','e','f'};
	
	
	//constructor por defecto
	public Electrodomestico() {
		this.precioBase=this.PRECIOBASE_DEF;
		this.color=this.COLOR_DEF;
		this.consumoEnergetico=this.CONSUMO_DEF;
		this.peso=this.PESO_DEF;
	}

	//constructor con precio base y peso
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color=this.COLOR_DEF;
		this.consumoEnergetico=this.CONSUMO_DEF;
	}

	//Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		String colora=color;
		//comprobamos que el color esta bien implementado
		boolean encontrado=false;
		for (String colore : arrayColores) {
			if (colora.toLowerCase()==colore) {
				encontrado=true;
			}
		}
		if (encontrado) {
			this.color = color;
		}else {
			this.color=this.COLOR_DEF;
	}
		
		//Comprobamos que el consumo esta bien implementado
		encontrado=false;
		
		for (char chara : arrayConsumo) {
			if (consumoEnergetico==chara) {
				encontrado=true;
			}
		}
		if (encontrado) {
			this.consumoEnergetico=consumoEnergetico;
		} else {
			this.consumoEnergetico=this.CONSUMO_DEF;
		}
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
	
	
	

}
