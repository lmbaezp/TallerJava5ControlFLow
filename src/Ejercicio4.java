import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void ejercicio4() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("-".repeat(60));
            System.out.println("Promociones en una Tienda de Ropa");
            System.out.println("-".repeat(60) + "\n");

            System.out.println("Indique el tipo de prenda a comprar \nCamisa - Pantalón - Chaqueta: ");
            String tipoPrenda = scanner.nextLine().toUpperCase();
            int costoCamisa = 25000;
            int costoPantalon = 45000;
            int costoChaqueta = 100000;
            int cantidad;
            double valorFinal = 0;

            switch(tipoPrenda){
                case "CAMISA":
                    System.out.println("¿Cuántos deseas comprar? ");
                    cantidad = scanner.nextInt();
                    scanner.nextLine();
                    if(cantidad > 5) {
                        valorFinal = cantidad * costoCamisa * 0.85;
                    } else {
                        valorFinal = cantidad * costoCamisa;
                    }
                    break;
                case "PANTALON", "PANTALÓN":
                    System.out.println("¿Cuántos deseas comprar? ");
                    cantidad = scanner.nextInt();
                    scanner.nextLine();
                    if(cantidad > 5) {
                        valorFinal = cantidad * costoPantalon * 0.85;
                    } else {
                        valorFinal = cantidad * costoPantalon;
                    }
                    break;
                case "CHAQUETA":
                    System.out.println("¿Cuántos deseas comprar? ");
                    cantidad = scanner.nextInt();
                    scanner.nextLine();
                    if(cantidad > 5) {
                        valorFinal = cantidad * costoChaqueta * 0.85;
                    } else {
                        valorFinal = cantidad * costoChaqueta;
                    }
                    break;
                default:
                    System.out.println("Debes ingresar uno de los tipos de prendas definidos");
                    break;
            }

            System.out.println("El valor final de tu compra es: " + valorFinal);


        } catch (InputMismatchException e) {
            System.out.println("La edad debe ser un número entero" +
                    "\nSolo puedes ingresar texto y los tipos indicados");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }

        scanner.close();

    }
}
