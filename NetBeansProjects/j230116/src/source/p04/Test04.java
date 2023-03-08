package source.p04;

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
            if(i < ar1.length -1)
                str.append("\n");
        }
        System.out.println("sum = " + sum);
        System.out.println(str);
    }
    public static void j0406() {
        int[] ar1 = {10,20,30,40,50};
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
        int[][] ar1 = {{10,20,30},{40,50,60}};
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
            if(i < ar1.length -1)
                str.append("\n");
        }
        System.out.println("sum = " + sum);
        System.out.println(str);
    }

}
