package source.p04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {

    public static void 一維基本型態陣列宣告() {
        int[] ar1 = new int[10];
        int ar11[] = new int[10];

        int[] ar2 = {10, 20, 30, 40, 50};
        int[] ar22 = new int[]{10, 20, 30, 40, 50};

        int[] ar3;
        ar3 = new int[5];

        int[] ar4;
        ar4 = new int[]{10, 20, 30, 40, 50};
    }

    public static void 二維基本型態陣列宣告() {
        int[][] ar1 = new int[2][3];
        int ar2[][] = new int[2][3];
        int[] ar3[] = new int[2][3];

        int[][] ar4 = {{10, 20, 30}, {40, 50, 60}};
        int ar5[][] = new int[][]{{10, 20, 30}, {40, 50, 60}};

        int[][] ar6;
        ar6 = new int[2][3];
        int[][] ar7;
        ar7 = new int[][]{{10, 20, 30}, {40, 50, 60}};

        int[] ara = {1, 2, 3};
        int[] arb = {4, 5, 6};
        int[][] arc = {ara, arb, {999, 888, 777}};

    }

    public static void 二維不規則陣列宣告() {

        int[][] ar1 = new int[4][];
        ar1[0] = new int[2];
        ar1[1] = new int[5];
        ar1[2] = new int[4];
        ar1[3] = new int[3];

        int[][] ar2 = {{10, 20}, {30, 40, 50, 60, 70}, {80, 90, 100, 110}, {120, 130, 140}};

    }

    public static void 物件陣列宣告1() {

        ArrayDemo1 a1;
        ArrayDemo1 a2;
        ArrayDemo1 a3;
        ArrayDemo1 a4;
        ArrayDemo1 a5;

        a1 = new ArrayDemo1();
        a2 = new ArrayDemo1();
        a3 = new ArrayDemo1();
        a4 = new ArrayDemo1();
        a5 = new ArrayDemo1();

        a1.x = 10;
        a1.xyz();

    }

    public static void 物件陣列宣告2() {

        ArrayDemo1[] ar1 = new ArrayDemo1[5];
        ar1[0] = new ArrayDemo1();
        ar1[1] = new ArrayDemo1();
        ar1[2] = new ArrayDemo1();
        ar1[3] = new ArrayDemo1();
        ar1[4] = new ArrayDemo1();

        ar1[0].x = 10;
        ar1[0].xyz();
    }

    public static void 物件陣列宣告3() {

        ArrayDemo1[] ar1 = new ArrayDemo1[5];
        for (int i = 0; i < ar1.length; ar1[i] = new ArrayDemo1(), i++);
        ar1[0].x = 10;
        ar1[0].xyz();

    }

    public static void 物件陣列宣告4() {
        ArrayDemo1[] c = {new ArrayDemo1(), new ArrayDemo1(), new ArrayDemo1(), new ArrayDemo1(), new ArrayDemo1()};
    }

    public static void 字串陣列宣告() {

        String[] ar1 = {"aaa", "bbb", "ccc", "ddd", "eee"};
    }

    public static void j0404() {
        int[] ar1 = new int[5];
        StringBuilder str = new StringBuilder("");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < ar1.length; i++) {
            System.out.printf("ar1[%d] = ", i);
            ar1[i] = sc.nextInt();
            sum += ar1[i];
            str.append(ar1[i]).append(" ");
        }
        System.out.println("sum = " + sum);
        System.out.println(str);

    }

    public static void j0405() {
        int[][] ar1 = new int[2][3];
        StringBuilder str = new StringBuilder("");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[0].length; j++) {
                System.out.printf("ar1[%d][%d] = ", i, j);
                ar1[i][j] = sc.nextInt();
                sum += ar1[i][j];
                str.append(ar1[i][j]).append(" ");
            }
            if (i < ar1.length - 1) {
                str.append("\n");
            }
        }
        System.out.println("sum = " + sum);
        System.out.println(str);
    }

    public static void j0406() {
        int[] ar1 = {10, 20, 30, 40, 50};
        StringBuilder str = new StringBuilder("");
        //Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < ar1.length; i++) {
            //System.out.printf("ar1[%d] = ", i);
            //ar1[i] = sc.nextInt();
            sum += ar1[i];
            str.append(ar1[i]).append(" ");
        }
        System.out.println("sum = " + sum);
        System.out.println(str);

    }

    public static void j0407() {
        int[][] ar1 = {{10, 20, 30}, {40, 50, 60}};
        StringBuilder str = new StringBuilder("");
        //Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[0].length; j++) {
                //System.out.printf("ar1[%d][%d] = ", i, j);
                //ar1[i][j] = sc.nextInt();
                sum += ar1[i][j];
                str.append(ar1[i][j]).append(" ");
            }
            if (i < ar1.length - 1) {
                str.append("\n");
            }
        }
        System.out.println("sum = " + sum);
        System.out.println(str);
    }

    public static void 函數產生陣列1() {
        String[] ar1;
        String str = "aa,bb,cc";
        ar1 = str.split(",");

        for (int i = 0; i < ar1.length; i++) {
            System.out.println(ar1[i]);
        }
    }

    public static void 函數產生陣列2() {
        char[] ar1;
        String str = "abcde";

        ar1 = str.toCharArray();
        for (int i = 0; i < ar1.length; i++) {
            System.out.println(ar1[i]);
        }
    }

    public static void 函數產生陣列3() {
        String[] ar1;

        try {
            FileReader fr = new FileReader("條碼.txt");
            BufferedReader br = new BufferedReader(fr);
            String data;
            while ((data = br.readLine()) != null) {
                ar1 = data.split(",");
                for (int i = 0; i < ar1.length; i++) {
                    System.out.println(ar1[i]);
                }
                System.out.println("========================");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void 快捷迴圈() {
        int[] ar11 = {1, 3, 5, 7, 9, 11};
        double[] ar22 = new double[5];
        boolean[] ar33 = new boolean[5];
        char[] ar44 = new char[5];
        ArrayDemo1[] ar55 = new ArrayDemo1[5];
        String[] ar66 = new String[5];

        int[][] ar77 = {{1, 3, 5}, {7, 9, 11}};

        for (int x : ar11) {
            System.out.print(x + " ");
        }
        System.out.println("\n=============================");
        for (double x : ar22) {
            System.out.print(x + " ");
        }
        System.out.println("\n=============================");
        for (boolean x : ar33) {
            System.out.print(x + " ");
        }
        System.out.println("\n=============================");
        for (char x : ar44) {
            System.out.print(x + " ");  //\u0000
        }
        System.out.println("\n=============================");
        for (ArrayDemo1 x : ar55) {
            System.out.print(x + " ");  //null
        }
        System.out.println("\n=============================");
        for (String x : ar66) {
            System.out.print(x + " ");  //null
        }
        System.out.println("\n=============================");

        for (int[] ar1 : ar77) {
            for (int x : ar1) {
                System.out.print(x + "\t");
            }
            System.out.println("");
        }
    }

    public static void 陣列的比較() {

        int[] ar1 = {10, 20, 30};
        int[][] ar2 = {{10, 20, 30, 40, 50}, {60, 70, 80, 90, 100}};
        int[][][] ar3 = new int[2][3][4];  //全都是 0

        //System.out.println(ar1==ar2);  //錯誤
        //System.out.println(ar2[0]==ar3[0]); //錯誤
        System.out.println(ar1 == ar2[0]);  //正確 但   址 比 址 false

        ar1 = ar2[0];  //不是 5 個 塞給 3 個 只是 位址取代

        for (int i : ar1) {
            System.out.print(i + " ");
        }
        System.out.println();

        //遇到值比較的時候要小心
        System.out.println(ar1[0] == ar2[1][2]); // 值 false
        System.out.println(ar2 == ar3[0]);  //址  false
        System.out.println(ar2[0][2] == ar3[0][0][0]);  //  值 false
    }

    public static void 泡沫排序法() {
        int[] num = {5, 8, 7, 6, 15, 2, 47, 16, 99, 14};
        int tmp;

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        System.out.print("由小到大排: ");;
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void random1() {
        int[][] ar1 = new int[100][7];
        for (int i = 0; i < ar1.length; i++) {
            System.out.print((i + 1) + "\t->\t");
            for (int j = 0; j < ar1[i].length; j++) {
                ar1[i][j] = (int) (Math.random() * 42) + 1;
                for (int k = 0; k < j; k++) {
                    if (j > 0 && (ar1[i][j] == ar1[i][k])) {
                        j--;
                        break;
                    }
                }
            }
            for (int j = 0; j < ar1[j].length - 1; j++) {
                for (int k = j + 1; k < ar1[j].length; k++) {
                    if (ar1[i][j] > ar1[i][k]) {
                        int tmp;
                        tmp = ar1[i][j];
                        ar1[i][j] = ar1[i][k];
                        ar1[i][k] = tmp;
                    }
                }
                System.out.print(ar1[i][j] + " \t");
            }
            System.out.println("");
        }
    }

    public static void 找陣列中的字串() {
        Scanner s = new Scanner(System.in);
        String input;
        System.out.print("Imang : ");
        input = s.next();

        if (input.equals("23") || input.equals("25") || input.equals("26")
                || input.equals("43")) {
            System.out.println("Data Correct!");
        } else {
            System.out.println("Data Error!");
        }

    }

    public static void 找陣列中的字串_陣列() {
        Scanner s = new Scanner(System.in);
        String input;
        String[] ar1 = {"23", "25", "26", "27", "28", "43"};
        boolean ok = false;
        System.out.print("Imang : ");
        input = s.next();

        for (int i = 0; i < ar1.length; i++) {
            if (input.equals(ar1[i])) {
                ok = true;
                break;
            }
        }

        if (ok) {
            System.out.println("Data Correct!");
        } else {
            System.out.println("Data Error!");
        }

    }

    public static void 找陣列中的字串_副程式() {
        Scanner s = new Scanner(System.in);
        String input;

        boolean ok = false;
        System.out.print("Imang : ");
        input = s.next();

        if (found(input)) {
            System.out.println("Data Correct!");
        } else {
            System.out.println("Data Error!");
        }

    }

    private static boolean found(String input) {

        String[] ar1 = {"23", "25", "26", "27", "28", "43"};
        for (int i = 0; i < ar1.length; i++) {
            if (input.equals(ar1[i])) {
                return true;
            }
        }
        return false;
    }

    public static void 字串長度() {
        String str1 = "我是 fish!";
        StringBuffer str2 = new StringBuffer("我是 fish!");
        StringBuilder str3 = new StringBuilder("我是 fish!");
        //無論中、英文或空白，每個都是 1 個字元 
        System.out.println("str1 字串長度 = " + str1.length());
        System.out.println("str2 字串長度 = " + str2.length());
        System.out.println("str3 字串長度 = " + str3.length());
    }

    public static void 取出子字串() {
        String str1 = "abcdef";
        String stra = str1.substring(2);
        String strb = str1.substring(2, 5);
        System.out.println("stra 字串 = " + stra);
        System.out.println("strb 字串 = " + strb);
    }

    public static void String產生方式() {
        //每次必要空間
        String a1 = new String("fish");
        String a2 = new String("fish");
        String a3 = new String("fish");

        //先搜尋 String Pool
        String b1 = "fish";
        String b2 = "fish";
        String b3 = "fish";

        System.out.println("(a1==a2) ==> " + (a1 == a2));  //false
        System.out.println("(a1.equal(a2) ==> " + (a1.equals(a2))); //true

        System.out.println("(b1==b2) ==> " + (b1 == b2)); //true  虛
        System.out.println("(b1.equal(b2) ==> " + (b1.equals(b2))); //true
    }

    //////////////////////////////////////////////////////////////////////////
    //自訂類別因沒覆寫 Object 類別的 equals 方法 , 因此全部都是 用 == 在比  
    public static void equals用法11() {
        StringDemo1 a1 = new StringDemo1();
        StringDemo1 a2 = new StringDemo1();

        System.out.println("(a1==a2) ==> " + (a1 == a2));  //false
        System.out.println("(a1.equal(a2) ==> " + (a1.equals(a2)));  //false
    }

    public static void equals用法12() {
        StringDemo2 a1 = new StringDemo2();
        StringDemo2 a2 = new StringDemo2();

        System.out.println("(a1==a2) ==> " + (a1 == a2));  //false
        System.out.println("(a1.equal(a2) ==> " + (a1.equals(a2)));  //true
    }

//String有覆寫    
    public static void equals用法21() {
        String a1 = new String("fish");
        String a2 = new String("fish");

        System.out.println("(a1==a2) ==> " + (a1 == a2));  //false
        System.out.println("(a1.equal(a2) ==> " + (a1.equals(a2)));  //true
    }

    //StringBuffer沒有覆寫
    public static void equals用法31() {
        StringBuffer a1 = new StringBuffer("fish");
        StringBuffer a2 = new StringBuffer("fish");

        System.out.println("(a1==a2) ==> " + (a1 == a2));  //false
        System.out.println("(a1.equal(a2) ==> " + (a1.equals(a2)));  //false
    }

    //StringBuilder沒有覆寫
    public static void equals用法32() {
        StringBuilder a1 = new StringBuilder("fish");
        StringBuilder a2 = new StringBuilder("fish");

        System.out.println("(a1==a2) ==> " + (a1 == a2));  //false
        System.out.println("(a1.equal(a2) ==> " + (a1.equals(a2)));  //false
    }

//八個包裝類別有覆寫
    public static void equals用法41() {
        Integer a1 = 4;
        Integer a2 = 4;

        System.out.println("(a1==a2) ==> " + (a1 == a2));  //false
        System.out.println("(a1.equal(a2) ==> " + (a1.equals(a2)));  //true
    }

    public static void equals用法42() {
        Long a1 = 4l;
        Long a2 = 4l;

        System.out.println("(a1==a2) ==> " + (a1 == a2));  //false
        System.out.println("(a1.equal(a2) ==> " + (a1.equals(a2)));  //true
    }

//////////////////////////////////////////////////////////////////////////////
    public static void 兩物件比較() {

        StringDemo1 a = new StringDemo1();
        StringDemo1 b = new StringDemo1();
        StringDemo2 c = new StringDemo2();

        System.out.println("(a==b) ==> " + (a == b));  //false
        //system.out.println("(a==c) ==> " + (a == c));

        System.out.println("(a.equals(b)) ==> " + a.equals(b));  //同型態 false
        System.out.println("(a.equals(c)) ==> " + a.equals(c));  //false
    }
    //////////////////////////////////////////////////////////////////////////////

    public static void 字串的運算1() {
        String ss = "賴玉珊";
        ss.concat("我愛你");
        System.out.println(ss); //賴玉珊
        ///////////////////////////////////////
        ss = ss.concat("我愛你");  //要重新指派
        System.out.println(ss); //賴玉珊我愛你
    }

    public static void 字串的運算2() {
        StringBuffer ss = new StringBuffer("賴玉珊");
        ss.append("我愛你");
        System.out.println(ss); //賴玉珊我愛你
    }

    public static void 字串的運算3() {  //5.0
        StringBuilder ss = new StringBuilder("賴玉珊");
        ss.append("我愛你");
        System.out.println(ss); //賴玉珊我愛你
    }

    public static void 字串的運算4() {
        String ss = "";
        for (int i = 1; i <= 10; i++) {
            ss = ss.concat(i + " ");
        }
        System.out.println(ss);
    }

    public static void 字串的運算5() {
        StringBuffer ss = new StringBuffer("");
        for (int i = 1; i <= 10; i++) {
            ss.append(i).append(" ");
        }
        System.out.println(ss);
    }

    public static void 字串的運算6() {
        StringBuilder ss = new StringBuilder("");
        for (int i = 1; i <= 10; i++) {
            ss.append(i).append(" ");
        }
        System.out.println(ss);
    }
}
