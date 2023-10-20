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
            total2 = total2 + total2 / 100;
            total2 = total2 + moneyInBank;
            System.out.println("Месяц " + i + " равен " + total2 + " накоплений");
        }
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
        int salary = 15000;
        int total3 = 0;
        int i = 0;
        while (total3 < 2_459_000) {
            total3 = total3 + total3 / 100;
            total3 = total3 + salary;
            i = i + 1;
            System.out.println("Месяц " + i + " равен " + total3 + " накоплений");
        }
        int w = 1;
        while (w <= 10) {
            System.out.print(w);
            w = w + 1;
        }
        System.out.println();

        for (int a = 10; a >= 1; a--) {
            System.out.print(a);
        }
        int population = 1_200_0000;
        int mortality = 8;
        int birthRate = 17;
        for (int year = 1; year <= 10; year = year + 1) {
            population = population + population * 17 / 1000 - population * 8 / 1000;
            System.out.println("Год " + year + " численность составляет " + population);
        }
        int moneyInBank2 = 15000;
        int procentMonth = 7;
        int r = 0;
        while (moneyInBank2 < 12000000) {
            moneyInBank2 = moneyInBank2 + (moneyInBank2 / procentMonth);
            r = r + 1;
            if (r % 6 == 0) {
                System.out.println("Месяц " + r + " накоплений " + moneyInBank2);
            }
        }
        for (int monthDay = 5; monthDay < 31; monthDay = monthDay + 7) {
                System.out.println("Сегодня пятница " + monthDay + " число");
        }
        for (int year = 1817; year <= 2054 + 100; year = year + 79) {
            System.out.println(year);
        }
        }
    }

