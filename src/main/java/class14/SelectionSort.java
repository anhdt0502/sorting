package class14;

import java.util.Arrays;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5, 8};

    public static void selectionSort(double[] list) {
//        double currentMin = list[0];
//        int currentMinIndex = 0;

        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < currentMin) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
            System.out.println("Pass " + (i+1) + ": " + Arrays.toString(list));
        }
    }
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.printf(list[i] + " ");

    }
}
