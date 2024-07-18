import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");

        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(weights[i]);
        }

        double[] weights1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights1.length; i++){
            System.out.println(weights1[i]);
        }

        double[] weights2 = {90, 91, 93, 92, 85, 87, 84, 83, 1.57, 7.654, 9.986};
        for (int i = 0; i < weights2.length; i++){
            System.out.println(weights2[i]);
        }

        System.out.println();
        System.out.println("Задача № 2");

        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i < weights.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < weights1.length; i++) {
            System.out.print(weights1[i]);
            if (i < weights1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < weights2.length; i++) {
            System.out.print(weights2[i]);
            if (i < weights2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача № 3");

        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = weights.length - 1 ; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weights1.length - 1 ; i >= 0; i--) {
            System.out.print(weights1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weights2.length - 1 ; i >= 0; i--) {
            System.out.print(weights2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача № 4");

        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0 ){
                weights[i] += 1;
            }

        }
        System.out.println(Arrays.toString(weights));
    }
}