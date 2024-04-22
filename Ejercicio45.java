import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola usuario");
        System.out.println("Ingrese su numero: ");
        double numero = leer.nextDouble();

        int resultado = obtenerEntero(numero);
        System.out.println("El valor del número " + numero + " es: " + resultado);
    }

    public static int obtenerEntero(double num) {
        if (num < 0) {
            return -1;
        } else if (num > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
