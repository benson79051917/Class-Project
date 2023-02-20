package source.p03;

import java.util.Scanner;

public class Test03 {

    public static void callporg1() {

        int x = 10;
        int y = 3;
        double z = (double) x / y;
        System.out.println("z = " + z);

    }

    public static void 換錢1() {

        int money = 987;
        int m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 = 0;

        m100 = money / 100;
        m50 = (money % 100) / 50;
        m10 = (money % 50) / 10;
        m5 = (money % 10) / 5;
        m1 = (money % 5) / 1;

        System.out.println("100 元 : " + m100);
        System.out.println("50 元 : " + m50);
        System.out.println("10 元 : " + m10);
        System.out.println("5 元 : " + m5);
        System.out.println("1 元 : " + m1);
    }

    public static void 換錢11() {
        int total;
        int spend;
        int money;
        int m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total :");
        total = sc.nextInt();
        System.out.print("Enter spend :");
        spend = sc.nextInt();
        money = total - spend;
        m100 = money / 100;
        m50 = (money % 100) / 50;
        m10 = (money % 50) / 10;
        m5 = (money % 10) / 5;
        m1 = (money % 5) / 1;
        System.out.println("Change:");
        System.out.println("$100 : " + m100);
        System.out.println("$50  : " + m50);
        System.out.println("$10  : " + m10);
        System.out.println("$5  : " + m5);
        System.out.println("$1  : " + m1);
    }

    public static void input() {
        int x, y, z;
        double sum, average;
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        x = sc.nextInt();
        System.out.print("y = ");
        y = sc.nextInt();
        System.out.print("z = ");
        z = sc.nextInt();
        sum = x + y + z;
        average = (x + y + z) / 3.0;
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }

    public static void callporg2() {
        short total = 0;
        int x = 10;
        total = (short) (total + x);
        total += x;
    }

    public static void callporg3() {
        int total = 0;
        short x = 10;
        total = total + x;
        total = total + x;
        total = total + x;
        total = total + x;
        total = total + x;
        System.out.println("1. total = " + total);

    }

    public static void callporg4() {
        int total = 0;
        short x = 10;
        total += x;
        total += x;
        total += x;
        total += x;
        total += x;
        System.out.println("2. total = " + total);
    }

    public static void 遞增遞減運算子5() {

        char[] str = {'a', 'b', 'c', 'd', 'e', 'f'};
        int length;
        length = str.length;
        int i = 0, j = length;

        do {
            // System.out.print(str[i++] + " ");
            System.out.print(str[i] + " ");
            i = i + 1;

        } while (i < length);

        System.out.println("\n================");

        do {
            // System.out.print(str[--j] + " ");
            j = j - 1;
            System.out.print(str[j] + " ");

        } while (j > 0);

        System.out.println("\n================");
    }

}
