import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola Usuario :D");
        System.out.println("Ingrese su iva: ");
        double Usiva = leer.nextDouble();
        System.out.println("Ingrese su precio: ");
        double n = leer.nextDouble();
        double iva = n / 100 * Usiva;
        System.out.println("Su iva es de: " + iva);
        System.out.println("Su precio con el iva es de: " + (iva + n));

    }

}
