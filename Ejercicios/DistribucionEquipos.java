import java.util.Scanner;

public class DistribucionEquipos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // 1. Leer y almacenar los valores en variables enteras
        System.out.print("Ingresa la cantidad total de estudiantes en la clase: ");
        int totalEstudiantes = lector.nextInt();

        System.out.print("Ingresa cuántos estudiantes debe tener cada equipo: ");
        int estudiantesPorEquipo = lector.nextInt();

        // 2. Mostrar en pantalla los valores ingresados
        System.out.println("\n--- Resumen de datos ---");
        System.out.println("Total de estudiantes: " + totalEstudiantes);
        System.out.println("Tamaño de cada equipo: " + estudiantesPorEquipo);

        // 3. Calcular cuántos equipos completos pueden formarse
        // La división entre números enteros (int) en Java descarta los decimales automáticamente
        int equiposCompletos = totalEstudiantes / estudiantesPorEquipo;

        // 4. Calcular cuántos estudiantes quedan sin equipo
        // El operador módulo (%) nos da el "resto" de la división
        int estudiantesSobrantes = totalEstudiantes % estudiantesPorEquipo;

        // 5. Mostrar los resultados con mensajes claros
        System.out.println("\n--- Resultados ---");
        System.out.println("Se pueden formar " + equiposCompletos + " equipos completos.");
        System.out.println("Quedan " + estudiantesSobrantes + " estudiante(s) sin integrar un equipo completo.");

        // Cerramos el scanner
        lector.close();
    }
}