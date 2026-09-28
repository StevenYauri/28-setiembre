import java.util.Scanner;

public class ComparacionSueldos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Lectura de los sueldos
        System.out.print("Ingrese sueldo 1: ");
        int sueldo1 = entrada.nextInt();

        System.out.print("Ingrese sueldo 2: ");
        int sueldo2 = entrada.nextInt();

        // 2. Comparaciones relacionales
        System.out.println(sueldo1 + " es mayor que " + sueldo2 + ": " + (sueldo1 > sueldo2));
        System.out.println(sueldo1 + " es menor que " + sueldo2 + ": " + (sueldo1 < sueldo2));
        System.out.println(sueldo1 + " es mayor o igual que " + sueldo2 + ": " + (sueldo1 >= sueldo2));
        System.out.println(sueldo1 + " es menor o igual que " + sueldo2 + ": " + (sueldo1 <= sueldo2));
        System.out.println(sueldo1 + " es igual a " + sueldo2 + ": " + (sueldo1 == sueldo2));
        System.out.println(sueldo1 + " es diferente de " + sueldo2 + ": " + (sueldo1 != sueldo2));

        // 3. Determinar quién gana más y calcular la diferencia
        if (sueldo1 > sueldo2) {
            System.out.println("El practicante 1 gana más.");
            int diferencia = sueldo1 - sueldo2;
            System.out.println("La diferencia salarial es: S/ " + diferencia);
        } else if (sueldo2 > sueldo1) {
            System.out.println("El practicante 2 gana más.");
            int diferencia = sueldo2 - sueldo1;
            System.out.println("La diferencia salarial es: S/ " + diferencia);
        } else {
            System.out.println("Ambos practicantes ganan lo mismo.");
            System.out.println("La diferencia salarial es: S/ 0");
        }
    }
}
