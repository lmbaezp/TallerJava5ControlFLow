import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void ejercicio3() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("-".repeat(60));
            System.out.println("Control de Acceso a un Parqueadero");
            System.out.println("-".repeat(60) + "\n");

            System.out.println("Indique el tipo de vehículo \nAuto - Moto - Bicicleta: ");
            String tipoVehiculo = scanner.nextLine().toUpperCase();
            int costo;
            double valorFinal;

            switch (tipoVehiculo){
                case "AUTO" -> costo = 10000;
                case "MOTO" -> costo = 5000;
                case "BICICLETA" -> costo = 2500;
                default -> costo = 0;
            }

            if(costo == 0){
                System.out.println("Debes ingresar uno de los tipos de vehículo indicados");
            } else {
                System.out.println("Indique la hora de llegada en formato 24 horas \nej: 6:30pm ingrese 1830 \nej 8:00pm ingrese 2000: ");
                int horaLlegada = scanner.nextInt();
                scanner.nextLine();
                if(horaLlegada > 2000){
                    valorFinal = costo*1.2;
                } else {
                    valorFinal = costo;
                }
                System.out.println("El costo total del parqueadero es: " + valorFinal);
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar la hora en el formato descrito");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }

        scanner.close();

    }
}
