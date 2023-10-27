package PenkinJavaHomeworkLess3;

import java.util.Scanner;

public class PenkinJavaHomeworkLess3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер метода от 1 до 5");
        int scan = scanner.nextInt();
        if (scan == 1) {
            greetings();
        }
        if (scan == 2) {
            int a1 = (int) (Math.random() * 100 - Math.random() * 100);
            int b1 = (int) (Math.random() * 100 - Math.random() * 100);
            int c1 = (int) (Math.random() * 100 - Math.random() * 100);
            checkSign(a1, b1, c1);
        }
        if (scan == 3) {
            selectColor();
        }
        if (scan == 4) {
            compareNumbers();
        }
        if (scan == 5) {
            addOrSubtractAndPrint(10, 50, false);
        }
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма чисел:");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println("положительная");

        } else {
            System.out.println("Сумма чисел:");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println("отрицательная");
        }
    }

    public static void selectColor() {
        int data = 15;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data < 20 && data > 10) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 67;
        int b = 50;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            int result = initValue + delta;
            System.out.println(result);
        } else {
            int result = initValue - delta;
            System.out.println(result);
        }
    }
}
