package Ej3;

public class UD8Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//pruebas clase Electrodomestico
		Electrodomestico a= new Electrodomestico();
		Electrodomestico b = new Electrodomestico(110, 50);
		Electrodomestico c = new Electrodomestico(120, "gris", 'a', 20);
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
	}

}
