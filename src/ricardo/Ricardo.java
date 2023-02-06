package ricardo;

public class Ricardo {


    public static void main(String[] args) {

        String nombre = "Ricardo";

        String hobbie1 = "Videojuegos";
        String hobbie2 = "Cine";
        String hobbie3 = "Futbol";

        String comida1 = "Hamburguesa";
        String comida2 = "Patatas Bravas";
        String comida3 = "Cocido";

        escribirNombre(nombre);

        escribirHobbies(hobbie1, hobbie2, hobbie3);

        escribirComidas(comida1, comida2, comida3);

    }
    public static void escribirNombre(String nombre) {
        System.out.println("Hola, me llamo " + nombre);
    }


    public static void escribirHobbies(String hobbie1, String hobbie2, String hobbie3) {
        System.out.println("Mis hobbies son: " + hobbie1 + ", " + hobbie2 + " y " + hobbie3);
    }
    public static void escribirComidas(String comida1, String comida2, String comida3) {
        System.out.println("Mis comidas favoritas son: " + comida1 + ", " + comida2 + " y " + comida3);
    }
}

