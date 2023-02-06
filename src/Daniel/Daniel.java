package Daniel;

public class Daniel {
	public static void main(String[] args) {
			System.out.println(literalNombre("Daniel"));
			System.out.println(hobby(1,"Caminar"));
			System.out.println(hobby(2,"Correr"));
			System.out.println(hobby(3,"Estudiar"));
			

            System.out.println(comida(1,"pizza"));
            System.out.println(comida(2,"pollo"));
            System.out.println(comida(3,"melon"));
			
	}
	public static String literalNombre(String Nombre) {
		return "Hola, soy"+Nombre;
	}
	public static String hobby(int i, String Hobby) {
		return i+" "+Hobby;
	}
	  public static String comida(int i, String Comida) {
	        return i+" "+Comida;
	    }
}
