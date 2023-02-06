package ricardo;

public class Ricardo {

	public static void main(String[] args) {
		
		String nombre = "Ricardo";
		
		String hobbie1 = "Videojuegos";
		String hobbie2 = "Cine";
		String hobbie3 = "Futbol";

		escribirNombre(nombre);
		
		escribirHobbies(hobbie1, hobbie2, hobbie3);
	}
	public static void escribirNombre(String nombre) {
		System.out.println("Hola, me llamo " + nombre);
	}
	
	
	public static void escribirHobbies(String hobbie1, String hobbie2, String hobbie3) {
		System.out.println("Mis hobbies son: " + hobbie1 + ", " + hobbie2 + " y " + hobbie3);
	}
	
}
