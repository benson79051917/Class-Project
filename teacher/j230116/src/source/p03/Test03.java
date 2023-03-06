package source.p03;

import java.util.Scanner;
import source.p02.ColorX;
import static source.p02.ColorX.BLUE;
import static source.p02.ColorX.RED;
import static source.p02.ColorX.YELLOW;

public class Test03 {

    public static void input() {
        Scanner a = new Scanner(System.in);
        int x;
        int y;
        int z;
        double sum;
        double average;

        System.out.print("x=");
        x = a.nextInt();
        System.out.print("y=");
        y = a.nextInt();
        System.out.print("z=");
        z = a.nextInt();

        sum = x + y + z;
        average = sum / 3.0;

        System.out.println("sum=" + sum);
        System.out.println("average=" + average);

    }

    public static void j0301() {
        int x = 10;
        int y = 3;
        double z;
        z = (double) x / y;
        System.out.println("z=" + z);
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
        Scanner a = new Scanner(System.in);
        int m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 = 0;

        System.out.print("total=");
        total = a.nextInt();
        System.out.print("spend=");
        spend = a.nextInt();

        money = total - spend;

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

    public static void j0302() {
        int total = 0;
        short x = 10;

        total = total + x;
        total += x;

    }

    public static void j0303() {
        int total = 0;
        short x = 10;

        total = total + x;
        total = total + x;
        total = total + x;
        total = total + x;
        total = total + x;
        System.out.println("1. total=" + total);
    }

    public static void j0304() {
        int total = 0;
        short x = 10;

        total += x;
        total += x;
        total += x;
        total += x;
        total += x;
        System.out.println("2. total=" + total);

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

    public static void j0305() {
        int a = 4;
        int b = 5;

        if (a > b) {

        }

        while (a > b) {

        }
    }

    public static void j0306() {
        int a = 4;
        int b = 5;

        System.out.println("a>b =" + (a != b));

    }

    public static void j0307() {

        if (!true) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

    }

    public static void j0308() {
        int i = 1;
        while (true) {

            System.out.println("success : " + i++);

        }

    }

    public static void j0309() {
        System.out.println("true && false && true : " + (true && false && true));
        System.out.println("false || false || false : " + (false || false || true));
        System.out.println("true ^ true : " + (false ^ true));
        System.out.println("! true : " + (!true));
    }

    public static void j0310() {
        int grade = 25;

        if (grade >= 90 || grade <= 100) {
            System.out.println("success");
        }
    }

    public static void j0311() {
        int a = 12;
        int b = 38;

        System.out.println("a & b : " + (a & b));
        System.out.println("~a : " + (~a));
    }

    public static void j0312() {

        int a = 10, b = 20, c;

        c = a > b ? 100 : 200;
        System.out.println("c=" + c);

        // System.out.println("c=" + (a > b ? 100 : 200));
    }

    public static void 中斷if() {
        int x = 3;

        if (x >= 1) {
            System.out.println("x>=1");
        } else if (x >= 2) {
            System.out.println("x>=2");
        } else if (x >= 3) {
            System.out.println("x>=3");
        } else if (x >= 4) {
            System.out.println("x>=4");
        } else if (x >= 5) {
            System.out.println("x>=5");
        }
    }

    public static void 連續if() {
        int x = 3;

        if (x >= 1) {
            System.out.println("x>=1");
        }
        if (x >= 2) {
            System.out.println("x>=2");
        }
        if (x >= 3) {
            System.out.println("x>=3");
        }
        if (x >= 4) {
            System.out.println("x>=4");
        }
        if (x >= 5) {
            System.out.println("x>=5");
        }
    }

    public static void j0313() {

        int a = 1, b = 2, c = 3, d = 4, e = 5;

        if (a > b) {

        }
        ////
        if (a > b) {

        } else {

        }
        ///////

        if (a > b) {

        } else if (b > c) {

        } else if (c > d) {

        } else {

        }
        /////////

        if (a > b) {
            if (b > d) {

            } else if (b > c) {

            } else {

            }

        } else {
            if (d > a) {

            } else {

            }
        }

    }

    public static void 輸入帳號密碼1() {
        String userid, password;

        final String user = "sun2000", pass = "1234";

        Scanner s = new Scanner(System.in);

        System.out.print("輸入帳號:");
        userid = s.next();

        System.out.print("輸入密碼:");
        password = s.next();

        if (userid.equals(user) && password.equals(pass)) {
            System.out.println("Pass");
        } else {
            System.out.println("No Pass");
        }
    }

    public static void if分數等級1() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("grade = ");
        grade = s.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D");
        } else if (grade >= 0 && grade <= 59) {
            System.out.println("E");
        } else {
            System.out.println("ERROR");
        }
    }

    public static void if分數等級2() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("grade = ");
        grade = s.nextInt();

        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }

    public static void if分數等級3() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("grade = ");
        grade = s.nextInt();

        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 70) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        } else {
            System.out.println("ERROR");
        }

    }

    public static void if分數等級4() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("grade = ");
        grade = s.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("ERROR");
        } else {
            if (grade >= 90) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 70) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }

    }

    public static void if分數等級() {
        //宣告
        int grade;
        Scanner s = new Scanner(System.in);
        //給值
        System.out.print("grade = ");
        grade = s.nextInt();
        //檢核
        if (grade < 0 || grade > 100) {
            System.out.println("ERROR");
            return;
        }
        //純粹計算        
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

    }

    public static void 整數_switch的架構() {
        int a = 66;
        final int B = 66;

        switch (a) { //整數
            case 65:  //數值常數
                System.out.println("我是65");
            case B:   //常數的變數
                System.out.println("我是66");
            case 'C': //字元
                System.out.println("我是67");
            case 68:
            case 69:
                System.out.println("我是68 或 69");
            default:
                System.out.println("我什麼都不是");
        }
    }

    public static void 整數_switch的架構1() {
        int a = 66;
        final int B = 66;

        switch (a) { //整數
            case 65:  //數值常數
                System.out.println("我是65");
                break;
            case B:   //常數的變數
                System.out.println("我是66");
                break;
            case 'C': //字元
                System.out.println("我是67");
                break;
            case 68:
            case 69:
                System.out.println("我是68 或 69");
                break;
            default:
                System.out.println("我什麼都不是");
        }
    }

    public static void 字串_switch的架構() {
        String a = "abc";

        switch (a) { // 字串 
            case "XYZ":
                System.out.println("我是XYZ");
                break;
            case "ABC":
                System.out.println("我是ABC");
                break;
            case "abc":
                System.out.println("我是abc");
                break;
            default:
                System.out.println("我什麼都不是");
        }
    }

    public static void 列舉_switch的架構() {
        ColorX a = ColorX.YELLOW;  //列舉變數       

        switch (a) { // 列舉
            case RED:
                System.out.println("我是RED");
                break;
            case YELLOW:
                System.out.println("我是YELLOW");
                break;
            case BLUE:
                System.out.println("我是BLUE");
                break;
            default:
                System.out.println("我什麼都不是");
        }
    }

    public static void switch分數等級() {
        //宣告
        int grade;
        Scanner s = new Scanner(System.in);
        //給值
        System.out.print("grade = ");
        grade = s.nextInt();
        //檢核
        if (grade < 0 || grade > 100) {
            System.out.println("ERROR");
            return;
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

    }

    public static void 站別switch() {
        String station;
        StringBuilder passStat = new StringBuilder("");
        Scanner s = new Scanner(System.in);

        System.out.print("A=台北\nB=板橋\nC=中壢\nD=新竹\n輸入起站 :");
        station = s.next();

        station = station.toUpperCase();

        switch (station) {
            case "A":
            case "a":
                passStat.append("台北->");
                System.out.println("台北開車");
            case "B":
                passStat.append("板橋->");
                System.out.println("板橋到了");
            case "C":
                passStat.append("中壢->");
                System.out.println("中壢到了");
            case "D":
                passStat.append("新竹");
                System.out.println("終站新竹");
                break;
            default:
                System.out.println("選項錯誤");
        }
        System.out.println("你的旅程是：\n" + passStat);
    }

    public static void 三元運算子switch() {

        int cartype, money = 0, money2 = 0, money3 = 0, money4 = 0, sum = 0;
        String cdplayer, sunroof, autotrans;

        Scanner s = new Scanner(System.in);

        System.out.print("請選擇:(1)跑車 (2)轎車(豪華型) (3)轎車(經濟型) : ");
        cartype = s.nextInt();
        System.out.println();

        if (cartype != 1 && cartype != 2 && cartype != 3) {
            System.out.println("選項錯誤\n");
            return;
        }

        System.out.print("是否加裝CD音響?(y/n) : ");
        cdplayer = s.next();

        System.out.print("是否加裝天窗?(y/n) : ");
        sunroof = s.next();

        System.out.print("是否該裝成自動排檔?(y/n) : ");
        autotrans = s.next();

        switch (cartype) {
            case 1:
                money = 800000;
                break;
            case 2:
                money = 650000;
                break;
            case 3:
                money = 450000;
                break;
            default:
                System.out.println("謝謝惠顧!\n");
        }

        money2 = (cdplayer.equals("y")) ? 4000 : 0;
        money3 = (sunroof.equals("y")) ? 5000 : 0;
        money4 = (autotrans.equals("y")) ? 3000 : 0;

        sum = money + money2 + money3 + money4;
        System.out.printf("總價格為:%d\n", sum);
        System.out.println("謝謝惠顧!\n");
    }

    public static void 算術運算1() {
        int x, y;
        int sum;
        Scanner s = new Scanner(System.in);

        System.out.print("num1=");
        x = s.nextInt();
        System.out.print("num2=");
        y = s.nextInt();

        sum = 四則運算1(x, y, '+');
        System.out.println("x+y=" + sum);
        sum = 四則運算1(x, y, '-');
        System.out.println("x-y=" + sum);
        sum = 四則運算1(x, y, '*');
        System.out.println("x*y=" + sum);
        sum = 四則運算1(x, y, '/');
        System.out.println("x/y=" + sum);
        sum = 四則運算1(x, y, '#');
        System.out.println("x#y=" + sum);
    }

    public static int 四則運算1(int x, int y, char op) {

        switch (op) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
            case 'X':
            case 'x':
                return x * y;
            case '/':
                return x / y;
            default:
                System.out.println("error");
                return 0;
        }
    }

    public static void 算術運算2() {
        int x, y;
        int sum;
        Scanner s = new Scanner(System.in);

        System.out.print("num1=");
        x = s.nextInt();
        System.out.print("num2=");
        y = s.nextInt();

        sum = 四則運算2(x, y, Count.加);
        System.out.println("x+y=" + sum);
        sum = 四則運算2(x, y, Count.減);
        System.out.println("x-y=" + sum);
        sum = 四則運算2(x, y, Count.乘);
        System.out.println("x*y=" + sum);
        sum = 四則運算2(x, y, Count.除);
        System.out.println("x/y=" + sum);
    }

    public static int 四則運算2(int x, int y, Count op) {

        switch (op) {
            case 加:
                return x + y;
            case 減:
                return x - y;
            case 乘:
                return x * y;
            case 除:
                return x / y;
            default:
                return 0;
        }
    }

    public static void j0399() {
        int i = 1;
        for (;;) {

            System.out.println("i love you" + i++);

        }
    }

    public static void j0398() {
        int i = 1;
        for (; i <= 10;) {

            System.out.println("i love you" + i++);

        }
        System.out.println("i=" + i);
    }

    public static void j0397() {
        int i;

        for (i = 1; i <= 10; i++) {
            System.out.println("for-i love you" + i);
        }

        ////
        i = 1;
        while (i <= 10) {
            System.out.println("while - i love you" + i);
            i++;
        }
        ////
        i = 1;
        do {
            System.out.println("do while - i love you" + i);
            i++;
        } while (i <= 10);
    }

    public static void j0396() {
        int i;

        for (i = 10; i >= 1; i--) {
            System.out.println("for-i love you" + i);
        }

        ////
        i = 10;
        while (i >= 3) {
            System.out.println("while - i love you" + i);
            i--;
        }
        ////
        i = 100;
        do {
            System.out.println("do while - i love you" + i);
            i -= 2;
        } while (i >= 0);
    }

    public static void j0395() {
        int i;
        int sum = 0;

        for (i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println("for i=" + i + " sum=" + sum);
        }

        ////
        i = 1;
        sum = 0;
        while (i <= 10) {
            sum = sum + i;
            System.out.println("while i=" + i + " sum=" + sum);
            i++;
        }
        ////
        i = 1;
        sum = 0;
        do {
            sum = sum + i;
            System.out.println("do while i=" + i + " sum=" + sum);
            i++;
        } while (i <= 10);
    }

    public static void j0394() {

        for (int i = 1; i <= 10; i++) {
            System.out.print(" i=" + i + " j=");
            for (int j = 1; j <= 10; j++) {

//                if (j < 10) {
//                    System.out.print(j + ",");
//                } else {
//                    System.out.print(j);
//                }
                System.out.print((j < 10) ? j + "," : j);

            }
            System.out.println();
        }
    }

    public static void j0393() {

        for (int i = 1; i <= 10; i++) {
            System.out.print("O");
            for (int j = 1; j <= 3; j++) {
                System.out.print("X");
            }
            System.out.println("O");
        }
    }

    public static void input_loop() {
        Scanner a = new Scanner(System.in);
        int x;

        double sum = 0;
        double average;

        for (int i = 1; i <= 3; i++) {
            System.out.print("x" + i + "=");
            x = a.nextInt();
            sum = sum + x;
        }

        average = sum / 3.0;

        System.out.println("sum=" + sum);
        System.out.println("average=" + average);

    }

    public static void 九九乘法1() {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
                if (i * j < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void j0392() {
        int x = 10;
        int y = 2;
        int z = 0;

        try {
            z = x / y;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("bye");
        }

        System.out.println("z=" + z);
    }

    public static void j0391() {

        for (int i = 1; i <= 10; i++) {

            System.out.println("for i=" + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}
