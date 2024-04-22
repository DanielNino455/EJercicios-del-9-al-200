import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido usuario.");
        System.out.print("Ingrese un número real: ");
        double numeroReal = leer.nextDouble();

        int parteEntera = (int) numeroReal;
        double parteDecimal = numeroReal - parteEntera;

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);

    }

}
