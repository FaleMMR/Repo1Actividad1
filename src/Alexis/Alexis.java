package Alexis;

public class Alexis {

public static void main(String[] args) {
		
		String mi_nombre = "Alexis";
		
		escribirMiNombre(mi_nombre);
		
		System.out.println(hobbys("Leer, jugar al fútbol y a los videojuegos"));

	}
	
	public static void  escribirMiNombre(String mi_nombre) {
		
		System.out.println("Hola, me llamo " + mi_nombre);
		
	}
	
	public static String hobbys(String hobby) {
		return "Mis hobbys son: " + hobby;		
	}
}
