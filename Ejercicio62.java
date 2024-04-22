import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");

        double temperaturaTotal = 0;
        double temperaturaMaxima = Double.MIN_VALUE;
        double temperaturaMinima = Double.MAX_VALUE;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Ingrese la temperatura exterior " + i + " (en grados Celsius):");
            double temperatura = leer.nextDouble();

            temperaturaTotal += temperatura;

            if (temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }
            if (temperatura < temperaturaMinima) {
                temperaturaMinima = temperatura;
            }
        }

        double temperaturaMedia = temperaturaTotal / 6;

        System.out.println("La temperatura media del día es: " + temperaturaMedia + " grados Celsius");
        System.out.println("La temperatura más alta del día es: " + temperaturaMaxima + " grados Celsius");
        System.out.println("La temperatura más baja del día es: " + temperaturaMinima + " grados Celsius");

    }
}
