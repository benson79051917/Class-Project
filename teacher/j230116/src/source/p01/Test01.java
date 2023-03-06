package source.p01;



public class Test01 {

    public static void callprog() {
        int x;
        //呼叫方法
        sub1();
        //呼叫函數
        x = fun1();
        System.out.println("fun1--->x=" + x);

        System.out.println("fun2--->x=" + fun1());
    }

    public static void sub1() {
        int x = 123;

        System.out.println("sub--->x=" + x);
    }

    public static int fun1() {
        int x = 999;

        return x;
    }

    //----------------------------------------------------------------
    public static void callprog2() {
        int sum;
        int a = 123;
        int b = 456;
        int c = 789;
        //呼叫方法
        sub2(a, b, c);
        //呼叫函數
        sum = fun2(a, b, c);
        System.out.println("sum=" + sum);

        System.out.println("sum=" + fun2(a, b, c));

    }

    public static void sub2(int a, int b, int c) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

    public static int fun2(int a, int b, int c) {
        return a + b + c;
    }
//---------------------------------------------------------------------------

    public static void 副程式的種類() {
        int x;
        int y;
        int sum;

        x = 4;
        y = 5;

        //方法呼叫
        sumxy(x, y);
        //函數呼叫1
        sum = sumab(x, y);

        System.out.println("函數1 sum=" + sum);
        //呼叫函數2
        System.out.println("函數2 sum=" + sumab(x, y));

    }

    //方法 , 程序 , sub
    public static void sumxy(int x, int y) {
        int sum;
        sum = x + y;
        System.out.println("方法 sum=" + sum);
    }

    //函數 , 函式 , function
    public static int sumab(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }
    /////////////////////////////////////////////////////////////////////////

    public static void callprog3() {
        System.out.println("OOOaaaXXX");
        System.out.println("OOObbbXXX");
        System.out.println("OOOcccXXX");
    }
    //////////////////////////////////////

    public static void callprog4() {
        list1();
        list2();
        list3();
    }

    public static void list1() {
        System.out.println("OOOaaaXXX");
    }

    public static void list2() {
        System.out.println("OOObbbXXX");
    }

    public static void list3() {
        System.out.println("OOOcccXXX");
    }

    //////////////////////////////////////
    public static void callprog5() {
        list("aaa");
        list("bbb");
        list("ccc");
    }

    public static void callprog6() {

        String x = "aaa";
        String y = "bbb";
        String z = "ccc";

        list(x);
        list(y);
        list(z);
    }

    public static void list(String x) {
        System.out.println("OOO" + x + "XXX");
    }

    //////////////////////////////////////////////////////////////////
    public static void 傳統程式() {
        int 長;
        int 寬;

        長 = 10;
        寬 = 5;

        長方形面積(長, 寬);
        長方形周長(長, 寬);
    }

    public static void 長方形面積(int 長, int 寬) {
        int 面積;
        面積 = 長 * 寬;
        System.out.println("面積=" + 面積);
    }

    public static void 長方形周長(int 長, int 寬) {
        int 周長;
        周長 = (長 + 寬) * 2;
        System.out.println("len=" + 周長);
    }
    /////////////////////////////////////////////////////////////////////

    public static void callProg7() {
        Rectangle1 rect1 = new Rectangle1();
        rect1.寬 = 10;
        rect1.長 = 20;
        rect1.長方形面積();
        rect1.長方形周長();

        Rectangle1 rect2 = new Rectangle1();
        rect2.寬 = 20;
        rect2.長 = 30;
        rect2.長方形面積();
        rect2.長方形周長();

    }

    public static void callProg8() {
        Rectangle2 rect1 = new Rectangle2();
        //rect1.寬 = 10;
        //rect1.長 = 20;
        rect1.set長寬(10, 20);
        rect1.長方形面積();
        rect1.長方形周長();

        Rectangle2 rect2 = new Rectangle2();
        // rect2.寬 = 20;
        // rect2.長 = 30;
        rect2.set長寬(20, 30);
        rect2.長方形面積();
        rect2.長方形周長();

    }

    public static void callProg9() {
        Human1 p1 = new Human1();
        p1.name = "aaa";
        p1.height = 160;
        p1.weight = 50;
        System.out.println("p1.name=" + p1.name);
        System.out.println("p1.height=" + p1.height);
        System.out.println("p1.weight=" + p1.weight);

        Human1 p2 = new Human1();
        p2.name = "bbb";
        p2.height = 170;
        p2.weight = 60;
        System.out.println("p2.name=" + p2.name);
        System.out.println("p2.height=" + p2.height);
        System.out.println("p2.weight=" + p2.weight);
    }

    public static void callProg10() {
        Human2 p1 = new Human2();
        p1.setdata("林青霞", 190, 50); //透過介面
        p1.getdata();

        Human2 p2 = new Human2();
        p2.setdata("bbb", 170, 60); //透過介面
        p2.getdata();
        p2.getdata();
    }
}
