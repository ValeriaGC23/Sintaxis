public class Ej5 {
    public static void main(String[] args) {

        int num = 10;
        int suma = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }
        System.out.println(suma);
    }
}
