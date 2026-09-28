import java.util.Scanner;

public class ComparacionPromedios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Lectura de los promedios
        System.out.print("Ingrese el promedio del estudiante 1: ");
        int promedio1 = entrada.nextInt();

        System.out.print("Ingrese el promedio del estudiante 2: ");
        int promedio2 = entrada.nextInt();

        // 2. Comparaciones relacionales
        System.out.println(promedio1 + " es mayor que " + promedio2 + ": " + (promedio1 > promedio2));
        System.out.println(promedio1 + " es menor que " + promedio2 + ": " + (promedio1 < promedio2));
        System.out.println(promedio1 + " es mayor o igual que " + promedio2 + ": " + (promedio1 >= promedio2));
        System.out.println(promedio1 + " es menor o igual que " + promedio2 + ": " + (promedio1 <= promedio2));
        System.out.println(promedio1 + " es igual a " + promedio2 + ": " + (promedio1 == promedio2));
        System.out.println(promedio1 + " es diferente de " + promedio2 + ": " + (promedio1 != promedio2));

        // 3. Determinar el mejor rendimiento y calcular la diferencia
        if (promedio1 > promedio2) {
            System.out.println("El estudiante 1 obtuvo el mejor promedio.");
            int diferencia = promedio1 - promedio2;
            System.out.println("La diferencia entre ambos promedios es: " + diferencia);
        } else if (promedio2 > promedio1) {
            System.out.println("El estudiante 2 obtuvo el mejor promedio.");
            int diferencia = promedio2 - promedio1;
            System.out.println("La diferencia entre ambos promedios es: " + diferencia);
        } else {
            System.out.println("Ambos estudiantes obtuvieron el mismo promedio.");
            System.out.println("La diferencia entre ambos promedios es: 0");
        }
    }
}
