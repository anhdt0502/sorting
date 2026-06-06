package class14;

import java.util.Arrays;

public class InsertionSortDemo {

    public static void insertionSort(int[] list) {

        for (int i = 1; i < list.length; i++) {

            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;

            System.out.print("Pass " + i + ": ");
            System.out.println(Arrays.toString(list));
        }
    }

    public static void main(String[] args) {

        int[] list = {5, 2, 4, 6, 1, 3};

        System.out.println("Mang ban dau:");
        System.out.println(Arrays.toString(list));

        insertionSort(list);

        System.out.println("Mang sau khi sap xep:");
        System.out.println(Arrays.toString(list));
    }
}
