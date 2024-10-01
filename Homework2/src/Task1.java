public class Task1 {
    public static void main(String[] args) {



            String str = new String("I study Basic Java!");

            System.out.println("Предпоследний символ строки: " + str.charAt(str.length() - 2));

            System.out.println("Содержит ли строка подстроку 'Java': " + str.contains("Java"));

            System.out.println("Строка без 'Java': " + str.substring(0, 14));

            System.out.println("Строка после замены 'a' на 'o': " + str.replace('a', 'o'));

            System.out.println("Строка в верхнем регистре: " + str.toUpperCase());

            System.out.println("Строка в нижнем регистре: " + str.toLowerCase());


        }
    }
