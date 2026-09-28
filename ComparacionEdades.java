import java.util.Scanner;

public class ComparacionEdades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Lectura de las edades
        System.out.print("Ingrese edad del trabajador 1: ");
        int edad1 = entrada.nextInt();

        System.out.print("Ingrese edad del trabajador 2: ");
        int edad2 = entrada.nextInt();

        // 2. Comparaciones relacionales
        System.out.println(edad1 + " es mayor que " + edad2 + ": " + (edad1 > edad2));
        System.out.println(edad1 + " es menor que " + edad2 + ": " + (edad1 < edad2));
        System.out.println(edad1 + " es mayor o igual que " + edad2 + ": " + (edad1 >= edad2));
        System.out.println(edad1 + " es menor o igual que " + edad2 + ": " + (edad1 <= edad2));
        System.out.println(edad1 + " es igual a " + edad2 + ": " + (edad1 == edad2));
        System.out.println(edad1 + " es diferente de " + edad2 + ": " + (edad1 != edad2));

        // 3. Determinar quién es mayor y calcular la diferencia
        if (edad1 > edad2) {
            System.out.println("El trabajador 1 es mayor.");
            int diferencia = edad1 - edad2;
            System.out.println("La diferencia de edad es: " + diferencia + " años.");
        } else if (edad2 > edad1) {
            System.out.println("El trabajador 2 es mayor.");
            int diferencia = edad2 - edad1;
            System.out.println("La diferencia de edad es: " + diferencia + " años.");
        } else {
            System.out.println("Ambos trabajadores tienen la misma edad.");
            System.out.println("La diferencia de edad es: 0 años.");
        }
    }
}
