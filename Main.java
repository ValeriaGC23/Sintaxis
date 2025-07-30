import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // LEER EN CONSOLA
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine(); //Lee linea completa en consola
        String palabra = sc.next(); //Lee palabra
        int edad = sc.nextInt(); // Lee enteros

        // IMPRIMIR
        System.out.println(palabra); //Imprime y agrega salto de linea
        System.out.print(palabra + "Hola"); //Imprime y no agrega salto de linea

        //If
        if (edad >= 18) {
        }
        else {
        }

        //FOR
        for (int i = 0; i < 10; i++) {
        }

        // WHILE
        while (i < 10) {
        }

        // CONVERSION DE TIPOS
        int num = 100;
        float numdecimal = num; // De entero a decimal

        int nume = 15;
        String texto = edad + "";  // De num a string

        String palabra2 = "1234";
        int n = Integer.parseInt(palabra2); //De string a int
        double d = Double.parseDouble(palabra2); //De string a double

        //Redondear
        float Pi = 3.998734f;
        System.out.printf("%.2f", Pi);

        // ARREGLOS
        int [] numeros  = new int [10]; //Inicializar arreglo
        int [] numeros2 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //Declarar arreglo

        System.out.println(Arrays.toString(numeros)); //Imprimir arreglo
        System.out.println(numeros2.length); //Imprimir num de elementos que tiene un array

    }
}

