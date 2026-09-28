import java.util.Scanner;

public class ComparacionConsumo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Lectura del consumo eléctrico
        System.out.print("Ingrese consumo del hogar 1: ");
        int consumo1 = entrada.nextInt();

        System.out.print("Ingrese consumo del hogar 2: ");
        int consumo2 = entrada.nextInt();

        // 2. Comparaciones relacionales
        System.out.println(consumo1 + " es mayor que " + consumo2 + ": " + (consumo1 > consumo2));
        System.out.println(consumo1 + " es menor que " + consumo2 + ": " + (consumo1 < consumo2));
        System.out.println(consumo1 + " es mayor o igual que " + consumo2 + ": " + (consumo1 >= consumo2));
        System.out.println(consumo1 + " es menor o igual que " + consumo2 + ": " + (consumo1 <= consumo2));
        System.out.println(consumo1 + " es igual a " + consumo2 + ": " + (consumo1 == consumo2));
        System.out.println(consumo1 + " es diferente de " + consumo2 + ": " + (consumo1 != consumo2));

        // 3. Determinar qué hogar consumió más y calcular la diferencia
        if (consumo1 > consumo2) {
            System.out.println("El hogar 1 consumió más energía.");
            int diferencia = consumo1 - consumo2;
            System.out.println("La diferencia es de " + diferencia + " kWh.");
        } else if (consumo2 > consumo1) {
            System.out.println("El hogar 2 consumió más energía.");
            int diferencia = consumo2 - consumo1;
            System.out.println("La diferencia es de " + diferencia + " kWh.");
        } else {
            System.out.println("Ambos hogares consumieron la misma cantidad de energía.");
            System.out.println("La diferencia es de 0 kWh.");
        }
    }
}
