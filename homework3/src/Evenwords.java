
//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например:
//ввод - mama, papa
//вывод - mapa


import java.util.Scanner;

public class Evenwords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the first word: ");
        String firstWord = sc.nextLine();
        System.out.println("Enter the second word: ");
        String secondWord = sc.nextLine();

        if (firstWord.length() % 2 == 0 && secondWord.length() % 2 == 0) {

            String firstHalf = firstWord.substring(0, firstWord.length() / 2);

            String secondHalf = secondWord.substring(secondWord.length() / 2);

            String result = firstHalf + secondHalf;
            System.out.println(result);

        }
 else {
                System.out.println("One or both words have an odd number of letters.");
            }



    }
}