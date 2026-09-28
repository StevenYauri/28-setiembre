import java.util.Scanner;

public class ComparacionKilometros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese kilómetros del conductor 1: ");
        int km1 = entrada.nextInt();

        System.out.print("Ingrese kilómetros del conductor 2: ");
        int km2 = entrada.nextInt();

        System.out.println(km1 + " es mayor que " + km2 + ": " + (km1 > km2));
        System.out.println(km1 + " es menor que " + km2 + ": " + (km1 < km2));
        System.out.println(km1 + " es mayor o igual que " + km2 + ": " + (km1 >= km2));
        System.out.println(km1 + " es menor o igual que " + km2 + ": " + (km1 <= km2));
        System.out.println(km1 + " es igual a " + km2 + ": " + (km1 == km2));
        System.out.println(km1 + " es diferente de " + km2 + ": " + (km1 != km2));

        if (km1 > km2) {
            System.out.println("El conductor 1 recorrió más kilómetros.");
            int diferencia = km1 - km2;
            System.out.println("Diferencia: " + diferencia + " km.");
        } else if (km2 > km1) {
            System.out.println("El conductor 2 recorrió más kilómetros.");
            int diferencia = km2 - km1;
            System.out.println("Diferencia: " + diferencia + " km.");
        } else {
            System.out.println("Ambos conductores recorrieron los mismos kilómetros.");
            System.out.println("Diferencia: 0 km.");
        }
    }
}
