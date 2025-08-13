import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void ejercicio2() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("-".repeat(60));
            System.out.println("Clasificación de Mascotas en una Veterinaria");
            System.out.println("-".repeat(60) + "\n");

            System.out.println("Indique el tipo de animal \nPerro - Gato - Ave - Otro: ");
            String tipoAnimal = scanner.nextLine().toUpperCase();
            String veterinario;
            boolean vacunacion = false;

            switch(tipoAnimal){
                case "PERRO" -> veterinario = "Veterinario 1";
                case "GATO" -> veterinario = "Veterinario 2";
                case "AVE" -> veterinario = "Veterinario 3";
                case "OTRO" -> veterinario = "Veterinario 4";
                default -> veterinario = "";
            }

            if(veterinario.isEmpty()){
                System.out.println("Debes ingresar uno de los tipos de animal indicados");
            } else {
                System.out.println("Indique la edad del animal (en número entero): ");
                int edad = scanner.nextInt();
                scanner.nextLine();
                if(edad > 5){
                    vacunacion = true;
                }
                System.out.println("Tu mascota ha sido asignada al " + veterinario);
                if(vacunacion){
                    System.out.println("Se recomienda vacunación adicional");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("La edad debe ser un número entero" +
                                "\nSolo puedes ingresar texto y los tipos indicados");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }

        scanner.close();

    }
}
