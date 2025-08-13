import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void ejercicio1(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("-".repeat(60));
            System.out.println("Sistema de Facturación para un Supermercado");
            System.out.println("-".repeat(60) + "\n");

            System.out.println("¿Cuál es el total de la compra?: ");
            double total = scanner.nextDouble();
            System.out.println("¿Cuántos productos compró?: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            System.out.println("¿Tiene membresía (Responda SI o NO)?: ");
            String membresia = scanner.nextLine().toUpperCase();
            double valorFinal;

            switch (membresia){
                case "SI":
                    if(cantidad > 10){
                        valorFinal = total*0.9*0.95;
                    } else{
                        valorFinal = total*0.9;
                    }
                    break;
                case "NO":
                    if(cantidad > 10){
                        valorFinal = total*0.95;
                    } else{
                        valorFinal = total;
                    }
                    break;
                default:
                    valorFinal = 0;
                    break;
            }

            if (valorFinal == 0) {
                System.out.println("Solo puedes ingresar SI o NO \nIntenta nuevamente");
            } else {
                System.out.printf("El valor final de tu compra es: %.2f%n", valorFinal);
            }
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Para el total puedes ingresar número con decimales usando ,. " +
                                "\nPara productos debe ser un valor entero." +
                                "\nEn la membresia solo puedes ingresar texto.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }




    }

}
