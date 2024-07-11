import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");

        int[] weights = new int[12];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < 12; i++) {
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

        int[] weights3 = new int[12];
        weights3[0] = 1;
        weights3[1] = 2;
        weights3[2] = 3;
        for (int i = 0; i < weights3.length; i++) {
            System.out.print(weights3[i]);
            if (i < weights3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] weights4 = {1.57, 7.654, 9.986};
        for (int i = 0; i < weights4.length; i++) {
            System.out.print(weights4[i]);
            if (i < weights4.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] weights5 = {90, 91, 93, 92, 85, 87, 84, 83, 1.57, 7.654, 9.986};
        for (int i = 0; i < weights5.length; i++) {
            System.out.print(weights5[i]);
            if (i < weights5.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача № 3");

        int[] weights6 = new int[12];
        weights6[0] = 1;
        weights6[1] = 2;
        weights6[2] = 3;
        for (int i = weights6.length - 1 ; i >= 0; i--) {
            System.out.print(weights6[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] weights7 = {1.57, 7.654, 9.986};
        for (int i = weights7.length - 1 ; i >= 0; i--) {
            System.out.print(weights7[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] weights8 = {90, 91, 93, 92, 85, 87, 84, 83, 1.57, 7.654, 9.986};
        for (int i = weights8.length - 1 ; i >= 0; i--) {
            System.out.print(weights8[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача № 4");

        int[] weights9 = new int[12];
        weights9[0] = 1;
        weights9[1] = 2;
        weights9[2] = 3;
        for (int i = 0; i < weights9.length; i++) {
            if (weights9[i] % 2 != 0 ){
                weights9[i] += 1;
            }

        }
        System.out.println(Arrays.toString(weights9));
    }
}