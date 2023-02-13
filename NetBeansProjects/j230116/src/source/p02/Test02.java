package source.p02;

import source.p01.Human1;

public class Test02 {

    public static void callprog1() {

        int x;
        int y, z, a, b;

        int f = 1;
        int e = 2, h = 3, u = 5, i = 5;

    }

    public static void callprog2() {

        int a123;
        int _123;
        int $123;
        int 中文;

//        int 123;
//        int -123;
//        int &123;
//        int float;
    }
    ////////////////////////////////////////////////////////////////////////

    public static void 其他類別_使用者自訂() {
        Human1 p1 = new Human1();
        p1.name = "賴玉珊";
        p1.height = 162;
        p1.weight = 50;
        System.out.println("p1=" + p1); //位址
        System.out.println("p1.name=" + p1.name); //值
    }
    ////////////////////////////////////////////////////////////////////////

    public static void 列舉型別() {
        boolean x = true;
        System.out.println(x);

        ColorX color = ColorX.ORANGE;
        System.out.println(color);

    }
    ////////////////////////////////////////////////////////////////////////

    public static void 變數分類二_內容能否改變() {

        int x1 = 4;
        String x2 = "abc";
        char x3 = 'A';
        boolean x4 = true;

        int y1 = 4;
        y1 = 5;
        y1 = 6;

        final double PI = 3.14159;
        //PI = 3.14;
        final int NUM;
        NUM = 18;
        // NUM = 20;

    }
    ////////////////////////////////////////////////////////////////////////

    public static void 變數分類三_值與址() {
        int a1 = 123;
        double a2 = 75.6;
        char a3 = 'A';
        boolean a4 = true;
        System.out.println("a1=" + a1); //值 123
        System.out.println("a2=" + a2); //值 75.6
        System.out.println("a3=" + a3); //值 'A' 
        System.out.println("a4=" + a4); //值  true
        ////////////////////////////////////
        int[] ar1 = new int[3];
        ar1[0] = 10;
        ar1[1] = 20;
        ar1[2] = 30;
        System.out.println("ar1=" + ar1); //址  [I@659e0bfd
        /////////////////////////////////////
        Integer b1 = 123;
        Double b2 = 123.45;
        System.out.println("b1=" + b1); //值 ,特 123
        System.out.println("b2=" + b2); //值 ,特 123.45
        /////////////////////////////////////
        String c1 = new String("abc");
        StringBuffer c2 = new StringBuffer("abc");
        StringBuilder c3 = new StringBuilder("abc");
        System.out.println("c1=" + c1); //值 ,特 "abc"
        System.out.println("c2=" + c2); //值 ,特 "abc"
        System.out.println("c3=" + c3); //值 ,特 "abc"
        /////////////////////////////////////
        Human1 p1 = new Human1();
        p1.name = "賴玉珊";
        p1.height = 162;
        p1.weight = 50;
        System.out.println("p1.name=" + p1.name); //值,特 "賴玉珊"
        System.out.println("p1=" + p1); //值,特 "賴玉珊 162 50"==>toString()覆寫
    }
    ////////////////////////////////////////////////////////////////////////    
    
    
    
}
