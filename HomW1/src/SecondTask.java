public class SecondTask {
    public static void main(String[] args) {
        char ch = '5';


        int asciiValue = (int) ch;


        int valueOfConversion = Integer.valueOf(String.valueOf(ch));


        int numericValue = Character.getNumericValue(ch);

        // Вывод результатов
        System.out.println("Преобразование CHAR -> INT:");
        System.out.println("Символ: " + ch);
        System.out.println("1. Использование ASCII значения: " + asciiValue);
        System.out.println("2. Использование valueOf(): " + valueOfConversion);
        System.out.println("3. Использование getNumericValue(): " + numericValue);
    }
}

