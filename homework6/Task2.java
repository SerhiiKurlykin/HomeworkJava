package homeWork.homework6;

import java.util.Random;

public class Task2 {

    // №2.
    //Создайте массив из 5 случайных целых чисел из интервала [10;99]
    //Выведите его на консоль в строку.
    //Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

    public static void main(String[] args) {
        int[] array = new int[5];
        Random rand = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10,100);
        }


        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            System.out.print(num + " ");
        }
        System.out.println();


        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }

        }
        if (isIncreasing) {
            System.out.println("The array is strictly increasing.");
        } else {
            System.out.println("The array is NOT strictly increasing.");
        }
    }
}