package homeWork.homework6;

import java.util.Random;

public class Task3 {

    //Дан массив размера  N-1  , содержащий только различные целые числа в диапазоне от  1 до N . Найдите недостающий элемент.
    //Пример 1:
    //Вход:
    //N = 5
    //А[] = {1,2,3,5}
    //Выход: 4
    //
    //
    //Пример 2:
    //Вход:
    //N = 10
    //А[] = {6,1,2,8,3,4,7,10,5}
    //Выход: 9



    public static void main(String[] args) {
        int N1 = 5;
        int[] A1 = {1, 2, 3, 5};
        System.out.println("Missing element: " + findMissingElement(N1, A1));

        int N2 = 10;
        int[] A2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        System.out.println("Missing element: " + findMissingElement(N2, A2));
    }


    public static int findMissingElement(int N, int[] A) {

        int sumTotal = N * (N + 1) / 2;


        int sumArray = 0;
        for (int i = 0; i < A.length; i++) {
            int num = A[i];
            sumArray += num;
        }


        return sumTotal - sumArray;
    }
}

