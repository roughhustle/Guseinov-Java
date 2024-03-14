import java.util.Scanner;

public class Aston {

    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("---------------------");
        task1();

        System.out.println();
        System.out.println("Task 2");
        System.out.println("----------------------");
        task2();

        System.out.println();
        System.out.println("Task 3");
        System.out.println("----------------------");
        task3();
    }

    private static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.print("Введите число b: ");
        int b = Integer.parseInt(in.nextLine());

        if (a < b) {
            System.out.println("a < b");
        }
        if (a > b) {
            System.out.println("a > b");
        }
        if (a == b) {
            System.out.println("a = b");
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }

    private static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку a: ");
        String a = in.nextLine();
        System.out.print("Введите строку b: ");
        String b = in.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    private static void task3() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Четные числа массива: ");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i]);
                System.out.print(" ");
            }
        }
    }
}
