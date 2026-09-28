import java.util.Scanner;

public class ComparacionAsistencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Lectura de las asistencias
        System.out.print("Ingrese asistencia del estudiante 1: ");
        int asistencia1 = entrada.nextInt();

        System.out.print("Ingrese asistencia del estudiante 2: ");
        int asistencia2 = entrada.nextInt();

        // 2. Comparaciones relacionales
        System.out.println(asistencia1 + " es mayor que " + asistencia2 + ": " + (asistencia1 > asistencia2));
        System.out.println(asistencia1 + " es menor que " + asistencia2 + ": " + (asistencia1 < asistencia2));
        System.out.println(asistencia1 + " es mayor o igual que " + asistencia2 + ": " + (asistencia1 >= asistencia2));
        System.out.println(asistencia1 + " es menor o igual que " + asistencia2 + ": " + (asistencia1 <= asistencia2));
        System.out.println(asistencia1 + " es igual a " + asistencia2 + ": " + (asistencia1 == asistencia2));
        System.out.println(asistencia1 + " es diferente de " + asistencia2 + ": " + (asistencia1 != asistencia2));

        // 3. Determinar quién tiene mejor asistencia y calcular la diferencia
        if (asistencia1 > asistencia2) {
            System.out.println("El estudiante 1 tiene mejor asistencia.");
            int diferencia = asistencia1 - asistencia2;
            System.out.println("Diferencia de asistencia: " + diferencia + "%");
        } else if (asistencia2 > asistencia1) {
            System.out.println("El estudiante 2 tiene mejor asistencia.");
            int diferencia = asistencia2 - asistencia1;
            System.out.println("Diferencia de asistencia: " + diferencia + "%");
        } else {
            System.out.println("Ambos estudiantes tienen la misma asistencia.");
            System.out.println("Diferencia de asistencia: 0%");
        }
    }
}
