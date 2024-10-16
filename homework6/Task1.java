package homeWork.homework6;

import java.util.Random;

public class Task1 {
    //Создайте массив из 8 случайных целых чисел из интервала [1;50]
    //Выведите массив на консоль в строку.
    //Замените каждый элемент с нечетным индексом на ноль.
    //Снова выведете массив на консоль в отдельной строке.


    public static void main(String[] args) {
        int[] array = new int[8];
        Random rand = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50) + 1;
        }


        System.out.print("Original array: ");
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            System.out.print(num + " ");
        }
        System.out.println();


        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }


        System.out.print("Modified array: ");
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            System.out.print(num + " ");
        }
    }
}

