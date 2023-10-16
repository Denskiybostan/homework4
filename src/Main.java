public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Последовательность чисел " + i);
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println("Последовательность чисел " + i);
        }
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println("Последовательность чисел " + i);
        }
        for (int i = 10; i >= -10; i--) {
            System.out.println("Последовательность чисел " + i);
        }
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Последовательность чисел " + i);
        }
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Последовательность чисел " + i);
        }
        int money = 29000;
        int total = 0;
        for (int i = 0; i < 12; i = i + 1) {
            total = total + money;
            System.out.println("Месяц " + i + " равен " + total + " накоплений");
        }
        int moneyInBank = 29000;
        int total2 = 0;
        for (int i = 0; i < 12; i = i + 1) {
            total2 = total2 + total2/100;
            total2 = total2 + moneyInBank;
            System.out.println("Месяц " + i + " равен " + total2 + " накоплений");
        }
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
        }
    }