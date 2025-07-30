public class Main {
    public static void main(String[] args) {
        int numeros[] = {1, 3, 2, 4, 1, 0, 5};

        //Rrevisa si el primer elemento es un pico
        if(numeros[0] > numeros[1]){
            System.out.println(0);
        }
        //Revisa los picos del segundo al penultimo elemento
        for (int i = 1; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i - 1] && numeros[i] > numeros[i + 1] ) {
                System.out.println(i);
            }
        }

        //Revisa si el ultimo elemento es un pico
        if (numeros[numeros.length - 1] > numeros[numeros.length - 2]) {
            System.out.println(numeros.length - 1);
        }
    }
}