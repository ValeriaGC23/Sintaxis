public class Ej3 {
    public static void main(String[] args) {

        int numeros[] = {1, 3, 2, 4, 5};

        boolean pico = false;

        while (pico == false) {

            //Rrevisa si el primer elemento es un pico
            if (numeros[0] > numeros[1]) {
                pico = true;
                System.out.println(0);
            }

            //Revisa los picos del segundo al penultimo elemento
            for (int i = 1; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i - 1] && numeros[i] > numeros[i + 1]) {
                    pico = true;
                    System.out.println(numeros[i]);
                    break;
                }

            }

            //Revisa si el ultimo elemento es un pico
            if (!pico && (numeros[numeros.length - 1] > numeros[numeros.length - 2])) {
                pico = true;
                System.out.println(numeros[numeros.length - 1]);
            }
            break;
        }

        if(!pico){
            System.out.println(-1);
        }
    }
}
