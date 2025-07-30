public class Ej2 {
    public static void main(String[] args) {
        int nums[] = {3, 34, 4, 12, 5, 2};

        int target = 9;

        boolean suma = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    suma = true;
                    System.out.println(suma);
                    break;
                }
            }
        }



    }
}
