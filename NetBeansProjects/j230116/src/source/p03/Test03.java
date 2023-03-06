package source.p03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

    public static void 寫檔案() {
        try {
            FileWriter fw = new FileWriter("file1.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("AAA");
            pw.println("BBB");

            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void 讀檔案() {
        try {
            FileReader fr = new FileReader("file1.txt");
            BufferedReader br = new BufferedReader(fr);

            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void 寫檔案_99() {
        try {
            FileWriter fw = new FileWriter("file1_99.txt", false);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    pw.printf("%d * %d = %d\t\t", j, i, j * i);
                    if (j == 9) {
                        pw.println();
                    }
                }
            }
            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void 讀檔案_99() {
        try {
            FileReader fr = new FileReader("file1_99.txt");
            BufferedReader br = new BufferedReader(fr);

            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void break1() {

        for (int i = 1; i <= 10; i++) {
            if (i > 6) {
                break;
            }
            System.out.print(i + " ");
        }
    }

    public static void break2() {

        AA:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j > 5) {
                    break AA; //加上標記一次可跳兩個迴圈
                }
                System.out.print(j + " ");
            }
        }
    }

    public static void continue1() {
        for (int i = 1; i <= 20; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public static void input_loop_check() {
        Scanner a = new Scanner(System.in);
        int x;

        double sum = 0;
        double average;

        for (int i = 1; i <= 3; i++) {
            System.out.print("x" + i + "=");
            x = a.nextInt();
            if (x < 0 || x > 100) {
                System.out.println("Error: 0 - 100");
                i--;
                continue;
            }
            sum = sum + x;
        }

        average = sum / 3.0;

        System.out.println("sum=" + sum);
        System.out.println("average=" + average);

    }

    public static void switch分數等級_loop() {
        //宣告
        int grade;
        Scanner s = new Scanner(System.in);
        String ans = "y";
        do {
            //給值
            System.out.print("grade = ");
            grade = s.nextInt();
            //檢核
            if (grade < 0 || grade > 100) {
                System.out.println("ERROR");
                continue;
            }
            switch (grade / 10) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("E");
            }
            System.out.print("Comtinue <Y / N> :");
            ans = s.next();
        } while (ans.equals("y") || ans.equals("Y"));

    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static int firstWeekDayOfYear(int year) {
        long day = year * 365;
        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                day += 1;
            }
        }
        return (int) day % 7;
    }

    public class Homework11_一年日曆 {

        static int year, weekDay;

        public static boolean isLeapYear(int year) {
            return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        }

        public static int firstWeekDayOfYear(int year) {
            long day = year * 365;
            for (int i = 1; i < year; i++) {
                if (isLeapYear(i)) {
                    day += 1;
                }
            }
            return (int) day % 7;
        }

        public static int getMonthOfDays(int month) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }
                default:
                    return 0;
            }
        }

        public static void showMonths() {
            for (int m = 1; m <= 12; m++) {
                System.out.println(m + "月");
                System.out.println("Sunday  Monday  Tuesday  Wednesday  Thursday  Friday  Saturday");
                for (int j = 1; j <= weekDay; j++) {
                    System.out.print("         ");
                }
                int monthDay = getMonthOfDays(m);
                for (int d = 1; d <= monthDay; d++) {
                    if (d < 10) {
                        System.out.print("  " + "0" + d + "     ");
                    } else {
                        System.out.print("  " + d + "     ");
                    }
                    weekDay = (weekDay + 1) % 7;
                    if (weekDay == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
            }
        }

        public static void main(String[] args) throws IOException {
            System.out.print("請輸入一個年份");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            year = Integer.parseInt(str);
            weekDay = firstWeekDayOfYear(year);
            System.out.println("\n          " + year + "年          ");
            showMonths();
        }

    }

    public static void 輸入帳號密碼2() {
        String str1 = null;

        boolean ok = false;
        final String password = "ymca";

        Scanner s1 = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Password: ");
            str1 = s1.next();

            if (str1.equals(password)) {
                ok = true;
                break;
            }

            System.out.println("Error: ");
            System.out.println();
        }
        if (ok) {
            System.out.println("Login successed");
        } else {
            System.out.println("Illegal Login");
        }
    }

    public static void 換錢2() {

        Scanner s = new Scanner(System.in);
        int money;
        int m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 = 0;

//        System.out.print("Input money ( < 1000 ) : ");
//        money = s.nextInt();
//        while (money >= 1000) {
//            System.out.println("money eror");
//            System.out.print("Input money ( < 1000 ) : ");
//            money = s.nextInt();
//        }                 
        while (true) {
            System.out.printf("Input money ( < 1000 ) : ");
            money = s.nextInt();

            if (money < 1000) {
                break;
            }
            System.out.println("Error , mony >=1000");
        }

        for (; money >= 100; money -= 100, m100++);
        for (; money >= 50; money -= 50, m50++);
        for (; money >= 10; money -= 10, m10++);
        for (; money >= 5; money -= 5, m5++);
        for (; money >= 1; money -= 1, m1++);

        System.out.println("100 元 : " + m100);
        System.out.println("50 元 : " + m50);
        System.out.println("10 元 : " + m10);
        System.out.println("5 元 : " + m5);
        System.out.println("1 元 : " + m1);
    }

    public static void 亂數() {
        //亂數種子的值 會分佈在 >=0  and <1 之間 
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 100) + 1);
        System.out.println((int) (Math.random() * 100) + 1);
        System.out.println((int) (Math.random() * 100) + 1);
        System.out.println((int) (Math.random() * 100) + 1);
        System.out.println((int) (Math.random() * 100) + 1);
        System.out.println((int) (Math.random() * 100) + 1);
    }

    public static void j0390() {
        int sum = 0;
        for (int i = 1, j = 1; i <= 10; sum = sum + i, System.out.println("sum = " + sum), i++);
        //System.out.println("sum = " + sum);
    }

    public static void grade() {
        int n, grade, t, total;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many people : ");
        n = s.nextInt();
        System.out.print("Enter how many subjects : ");
        t = s.nextInt();
        for (int i = 1; i <= n; i++) {
            total=0;
            System.out.println("People " + i );
            if (n < 0) {
                System.out.println("Enter error !");
                i--;
                continue;
            }
            for (int j = 1; j <= t; j++) {
                System.out.print("subject " + j + " : ");
                grade = s.nextInt();
                if (grade< 0 || grade > 100) {
                    System.out.println("Enter error !");
                    j--;
                    continue;
                }
                total += grade;
            }
            System.out.println("people" + i + " total : " + total);
            System.out.println("people" + i + " average : " + (double)total / t);
        }

    }
}
