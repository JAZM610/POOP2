/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop2; // Paquete que contiene la clase POOP2

/**
 * Clase principal del programa POOP2.
 * 
 * @author DLTM
 */
public class POOP2 {
    
    /**
     * Método principal que se ejecuta al iniciar el programa.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Imprime mensajes de saludo en la consola
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
        
        // Ejemplo de estructura if
        System.out.println("########## if ##########");
        int a = 5;
        int b = 3;
        if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
        
        // Ejemplo de estructura if en un método
        System.out.println("########## if en método ##########");
        if (menor(a, b)) {
            System.out.println("a es menor que b");
        } else {
            System.out.println("b es menor que a");
        }
        
        // Ejemplo de estructura switch
        System.out.println("########## switch ##########");
        int dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sábado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("No es un día de la semana");
        }
        System.out.println("########## switch vocales ##########");
char vocal = 'a';
switch (vocal) {
    case 'a':
        System.out.println("Es la letra a");
        break;
    case 'e':
        System.out.println("Es la letra e");
        break;
    case 'i':
        System.out.println("Es la letra i");
        break;   
    case 'o':
        System.out.println("Es la letra o");
        break;    
    case 'u':
        System.out.println("Es la letra u");
        break;    
    default:
        System.out.println("No es una vocal");        
}

System.out.println("########## While ##########");
int n = 0;
while (n < 10) {
    System.out.println("Contando hacia arriba n = " + n);
    n++;
}
while (n > 0) {
    System.out.println("Contando hacia abajo n = " + n);
    n--;
}
System.out.println("n = " + n);

System.out.println("########## Do-While ##########");
do {            
    System.out.println("Contando hacia abajo");
    n--;
} while (n > 0);
System.out.println("n = " + n);

System.out.println("########## For ##########");
for (int i = 0; i < 10; i++) {
    System.out.println("Contando hacia arriba " + i);  
}

for (int i = 10; i > 0; i--) {
    System.out.println("Contando hacia abajo " + i);
}

System.out.println("########## For ##########");
int[] miArreglo = {1, 2, 3, 4, 5};
int numElementos = miArreglo.length;
System.out.println("miArreglo tiene " + numElementos + " elementos");

int[] miArreglo2 = new int[10];
numElementos = miArreglo2.length;
System.out.println("miArreglo2 tiene " + numElementos + " posiciones");

for (int i = 0; i < miArreglo2.length; i++) {
    miArreglo2[i] = i * 10;
}

for (int i = 0; i < miArreglo2.length; i++) {
    System.out.println("miArreglo2[" + i + "] = " + miArreglo2[i]);
}

for (int i = 0; i < miArreglo2.length; i++) {
    int j = miArreglo2[i];
    System.out.println("Mapeo en porcentaje " + j + "%");
}

System.out.println("########## For-each ##########");
for (int i : miArreglo2) {
    System.out.println("Hackeando la nasa " + i + "%");
}
}

/**
 * Método que determina si el primer número es menor que el segundo.
 * 
 * @param a Primer número.
 * @param b Segundo número.
 * @return true si a es menor que b, false en caso contrario.
 */
private static boolean menor(int a, int b) {
    return a < b;
}
}