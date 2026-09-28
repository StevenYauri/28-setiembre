import java.util.Scanner;

public class ComparacionVentas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese ventas del vendedor 1: ");
        int ventas1 = entrada.nextInt();

        System.out.print("Ingrese ventas del vendedor 2: ");
        int ventas2 = entrada.nextInt();

        System.out.println(ventas1 + " es mayor que " + ventas2 + ": " + (ventas1 > ventas2));
        System.out.println(ventas1 + " es menor que " + ventas2 + ": " + (ventas1 < ventas2));
        System.out.println(ventas1 + " es mayor o igual que " + ventas2 + ": " + (ventas1 >= ventas2));
        System.out.println(ventas1 + " es menor o igual que " + ventas2 + ": " + (ventas1 <= ventas2));
        System.out.println(ventas1 + " es igual a " + ventas2 + ": " + (ventas1 == ventas2));
        System.out.println(ventas1 + " es diferente de " + ventas2 + ": " + (ventas1 != ventas2));

        if (ventas1 > ventas2) {
            System.out.println("El vendedor 1 realizó más ventas.");
            int diferencia = ventas1 - ventas2;
            System.out.println("La diferencia es: S/ " + diferencia);
        } else if (ventas2 > ventas1) {
            System.out.println("El vendedor 2 realizó más ventas.");
            int diferencia = ventas2 - ventas1;
            System.out.println("La diferencia es: S/ " + diferencia);
        } else {
            System.out.println("Ambos vendedores realizaron las mismas ventas.");
            System.out.println("La diferencia es: S/ 0");
        }
    }
}
