public class SecuenciaAleatoria {
    public static void main(String[] args) {
        
        // 1. Creamos la variable acumuladora para los números impares
        int sumaImpares = 0;
        
        System.out.println("--- Iniciando generación de números ---");
        
        // 2. El bucle while se repetirá MIENTRAS la suma sea menor o igual a 25
        while (sumaImpares <= 25) {
            
            // 3. Generar un número aleatorio entre 0 y 10
            // Al multiplicar por 11, obtenemos valores entre 0.0 y 10.999...
            // (int) corta los decimales dejándolo entre 0 y 10.
            int numero = (int)(Math.random() * 11);
            
            // 4. Usar condicionales para evaluar si es par o impar
            // Si el resto de dividir por 2 es cero, el número es par
            if (numero % 2 == 0) {
                System.out.println("Número generado: " + numero + " (Es PAR)");
            } else {
                // Si no es cero, es impar
                System.out.println("Número generado: " + numero + " (Es IMPAR)");
                
                // 5. Sumarlo a la variable acumuladora
                sumaImpares = sumaImpares + numero;
            }
        }
        
        // 6. Al superar 25, el bucle termina y mostramos el resultado final
        System.out.println("---------------------------------------");
        System.out.println("¡Programa detenido! La suma de impares superó el valor de 25.");
        System.out.println("La suma total calculada es: " + sumaImpares);
    }
}