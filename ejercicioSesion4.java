import java.util.Arrays;

public class ejercicioSesion4 {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Ana", "Maria", "Antonio"};

        for(int i = 0; i < 1; i++){
            String nombresToString = Arrays.toString(nombres);
            String name = nombresToString.replace("[", "").replace("]", "");
            String nombre = name.replace(",", "");

            System.out.println(nombre);
        }

        // Con "concat" o "+" no he sabido hacerlo.




    }
}
