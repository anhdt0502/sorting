package class14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    static List<Student> students = Arrays.asList(
            new Student("B",20D),
            new Student("B",15D),

            new Student("C",16D),
            new Student("A",14D),
            new Student("D",19D));
    public static <T extends Comparable<T>> void bubbleSortStudent(List<T> list)
    {
        for (int i = 0; i < list.size() -1; i++) {


            for (int j = 0; j < list.size() - i -1; j++) {

                if (list.get(j).compareTo(list.get(j+1)) > 0) {

                    T temp = list.get(j);

                     list.set(j, list.get(j+1));

                    list.set(j+1, temp);


                }
            }
            System.out.println("Pass " + (i + 1) + list.toString());

        }
    }
    static int[] list = {2, 3, 8, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
//        boolean needNextPass = true;

        for (int i = 0; i < list.length -1; i++) {
//            needNextPass = false;

            for (int j = 0; j < list.length - i-1; j++) {

                if (list[j] > list[j + 1]) {

                    int temp = list[j];

                    list[j] = list[j + 1];

                    list[j + 1] = temp;

//                    needNextPass = true;
                }
            }
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(list));

        }
    }

    public static void main(String[] args) {

        System.out.println("Before sort:");

        System.out.println(Arrays.toString(students.toArray()));

        bubbleSortStudent(students);



        System.out.println("\nAfter sort:");

        System.out.println(Arrays.toString(students.toArray()));

//        bubbleSort(list);
//        for (int i = 0; i < list.length; i++)
//            System.out.print(list[i] + " ");
    }


}
