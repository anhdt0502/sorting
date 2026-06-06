package class14;

import java.util.Arrays;

public class BubbleSortM {

    static int[] list = {2, 3, 8, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {

            for (int j = list.length - 1; j > i; j--) {

                if (list[j] < list[j - 1]) {

                    int temp = list[j];

                    list[j] = list[j - 1];

                    list[j - 1] = temp;
                }
            }

            System.out.println("Pass " + (i + 1) + " -> Min fixed: " + list[i] + " | " + Arrays.toString(list));
        }
    }

    public static void main(String[] args) {

        bubbleSort(list);
    }
}