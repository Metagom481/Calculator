import java.util.Scanner;
public class Main {
    public static void main(String[] arguments) {
        int operator, a, b;

        System.out.println(" 1 - Сложить \n 2 - Вычесть \n 3 - Умножить \n 4 - Разделить \n 5 - Сравнить");
        System.out.print("Выберите действие: ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();

// Ввод двух целых чисел
        System.out.print("Введите число a: ");
        a = sc.nextInt();
        System.out.print("Введите число b: ");
        b = sc.nextInt();


// Операции сложения, вычитания, умножения, деления и сравнения
        int result = 0;
        switch (operator) {
            case 1:
                System.out.println("Сумма: " + (a + b));
                break;

            case 2:
                System.out.println("Разность: " + (a - b));
                break;

            case 3:
                System.out.println("Произведение: " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Частное: " + ((float) a / b));
                } else {
                    System.out.println("Деление на ноль невозможно");
                }
                break;

            case 5:
                if (a > b) {
                    System.out.println("Результат сравнения: a > b");
                } else if (a < b) {
                    System.out.println("Результат сравнения: a < b");
                } else {
                    System.out.println("Результат сравнения: a = b");
                }
        }
    }
}
