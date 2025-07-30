public class Ej1A {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int suma = 0;

        // Recorremos el arreglo con un for básico
        for (int i = 0; i < nums.length; i++) {
            // Si el número es par, lo sumamos
            if (nums[i] % 2 == 0) {
                suma += nums[i];
            }
        }

        System.out.println("Suma de pares: " + suma);  // Resultado: 12
    }
}


public class Ej1B {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int suma = 0;

        // Recorremos el arreglo
        for (int i = 0; i < nums.length; i++) {
            int valor = nums[i];  // Guardamos el número en una variable
            if (valor % 2 == 0) {
                suma = suma + valor;
            }
        }

        System.out.println("Suma de pares: " + suma);  // Resultado: 12
    }
}


public class Ej2A {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        for (int i = 0; i < nums.length; i++) {
            boolean unico = true;

            for (int j = 0; j < nums.length; j++) {
                // Evitamos comparar la misma posición
                if (i != j && nums[i] == nums[j]) {
                    unico = false;
                    break;
                }
            }

            if (unico) {
                System.out.println("Número único: " + nums[i]); // Resultado: 4
                break;  // Solo uno cumple, así que salimos
            }
        }
    }
}


public class Ej2B {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        for (int i = 0; i < nums.length; i++) {
            int contador = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    contador++;
                }
            }

            if (contador == 1) {
                System.out.println("Número único: " + nums[i]); // Resultado: 4
                break;
            }
        }
    }
}

public class Ej3A {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        // Buscamos del 1 hasta el tamaño del arreglo
        for (int i = 1; i <= nums.length; i++) {
            boolean encontrado = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Falta el número: " + i);
            }
        }
    }
}

public class Ej3B {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        for (int i = 1; i <= nums.length; i++) {
            int contador = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    contador++;
                }
            }

            if (contador == 0) {
                System.out.println("Falta el número: " + i);
            }
        }
    }
}
