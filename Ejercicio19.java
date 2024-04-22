import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido usuario.");

        System.out.print("Ingrese el sueldo básico del empleado: ");
        double sueldoBasico = leer.nextDouble();

        System.out.print("Ingrese el monto por horas extras: ");
        double horasExtras = leer.nextDouble();

        double totalGanado = sueldoBasico + horasExtras;

        double descuento = 0.20 * totalGanado;

        double sueldoNeto = totalGanado - descuento;

        System.out.println("Sueldo básico: $" + sueldoBasico);
        System.out.println("Total del descuento (20%): $" + descuento);
        System.out.println("Total ganado (después del descuento): $" + sueldoNeto);

    }
}
