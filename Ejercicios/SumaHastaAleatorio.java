public class SumaHastaAleatorio {
    public static void main(String[] args) {
        
        // 1. Generar un número aleatorio entre 1 y 20
        // Math.random() genera un decimal entre 0.0 y 0.999...
        // Al multiplicarlo por 20 da un valor entre 0.0 y 19.999...
        // (int) le quita los decimales dejándolo entre 0 y 19. Al sumar 1, queda entre 1 y 20.
        int m = (int)(Math.random() * 20) + 1;
        
        // 2. Mostrar en pantalla el número generado
        System.out.println("El número aleatorio generado (m) es: " + m);
        
        // 3. Crear una variable para guardar el resultado de la suma
        int suma = 0;
        
        // 4. Usar una estructura repetitiva (bucle for) para sumar desde 1 hasta m
        for (int i = 1; i <= m; i++) {
            suma = suma + i; // Sumamos el valor actual de 'i' a nuestra variable 'suma'
        }
        
        // 5. Mostrar el resultado final
        System.out.println("La suma de todos los números del 1 al " + m + " es: " + suma);
    }
}