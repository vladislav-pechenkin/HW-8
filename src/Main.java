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

        System.out.println("Задача № 2");


    }
}