package Daniel;

public class Daniel {
	public static void main(String[] args) {
			System.out.println(literalNombre("Daniel"));
			System.out.println(hobby(1,"Caminar"));
			System.out.println(hobby(2,"Correr"));
			System.out.println(hobby(3,"Estudiar"));
	}
	public static String literalNombre(String Nombre) {
		return "Hola, soy"+Nombre;
	}
	public static String hobby(int i, String Hobby) {
		return i+" "+Hobby;
	}
}
