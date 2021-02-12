package Ej2;

public class UD8Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Pruebas clase Password
		Password p1= new Password();
		System.out.println(p1.longitud);
		System.out.println(p1.contressenya);
		
		
		Password p2= new Password(9);
		System.out.println(p2.longitud);
		System.out.println(p2.contressenya);
		
	}

}
