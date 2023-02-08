package source.p01;

public class Test01 {

    public static void callprog1() {
        int x;
        //call sub:
        sub1();
        //call function:
        x = fun1();
        System.out.println("fun1-1 ----> x = " + x);
        System.out.println("fun1-2 ----> x = " + fun1());
    }

    public static void sub1() {
        int x = 123;
        System.out.println("sub1 ----> x = " + x);
    }

    public static int fun1() {
        int x = 999;
        return x;
    }

    ///////////////////////////////////////////////////////////////////////
    public static void callprog2() {
        int sum;
        int a = 111;
        int b = 222;
        int c = 333;
        //call sub:
        sub2(a, b, c);
        //call function:
        sum = fun2(a, b, c);
        System.out.println("fun2-1 ----> x = " + sum);
        System.out.println("fun2-2 ----> x = " + fun2(a, b, c));
    }

    public static void sub2(int a, int b, int c) {
        System.out.println("sub2 ---->");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public static int fun2(int a, int b, int c) {
        return a + b + c;
    }

    ////////////////////////////////////////////////////////////////////////
    public static void callprog3() {
        int sum;
        int x = 5;
        int y = 9;
        //call sub:
        sumxy(x, y);
        //call function:
        sum = sumab(x, y);
        System.out.println("fun1: sumab ----> sum = " + sum);
        System.out.println("fun2: sumab ----> sum = " + sumab(x, y));
    }

    public static void sumxy(int x, int y) {
        int sum;
        sum = x + y;
        System.out.println("sub: sumxy ----> sum = " + sum);
    }

    public static int sumab(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    ////////////////////////////////////////////////////////////////////////////
    public static void callprog4() {
        System.out.println("oooaaaxxx");
        System.out.println("ooobbbxxx");
        System.out.println("ooocccxxx");
    }

    ////////////////////////////////////////////////////////////////////////////
    public static void callprog5() {
        list1();
        list2();
        list3();
    }

    public static void list1() {
        System.out.println("oooaaaxxx");
    }

    public static void list2() {
        System.out.println("ooobbbxxx");
    }

    public static void list3() {
        System.out.println("ooocccxxx");
    }

    ////////////////////////////////////////////////////////////////////////////
    public static void callprog6() {
        list("aaa");
        list("bbb");
        list("ccc");
    }

    public static void callprog7() {
        String x = "aaa";
        String y = "bbb";
        String z = "ccc";
        list(x);
        list(y);
        list(z);
    }

    public static void list(String s) {
        System.out.println("ooo" + s + "xxx");
    }
    ////////////////////////////////////////////////////////////////////////////

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
        System.out.println("area=" + 面積);
    }

    public static void 長方形周長(int 長, int 寬) {
        int 周長;
        周長 = (長 + 寬) * 2;
        System.out.println("len=" + 周長);
    }
    ////////////////////////////////////////////////////////////////////////////

    public static void callProg7() {

        Rectangle1 rect1 = new Rectangle1();
        rect1.長 = 10;
        rect1.寬 = 5;
        rect1.長方形面積();
        rect1.長方形周長();

        Rectangle1 rect2 = new Rectangle1();
        rect2.長 = 10;
        rect2.寬 = 4;
        rect2.長方形面積();
        rect2.長方形周長();
    }

    public static void callProg8() {

        Rectangle2 rect1 = new Rectangle2();
        rect1.set長(10, 4);

        rect1.長方形面積();
        rect1.長方形周長();
        Rectangle2 rect2 = new Rectangle2();
        rect2.set長(10, 5);

        rect2.長方形面積();
        rect2.長方形周長();
    }

    public static void callProg9() {
        Rectangle3 rect10 = new Rectangle3(10, 5);
        rect10.長方形面積();
        rect10.長方形周長();

        Rectangle3 rect11 = new Rectangle3(20, 10);
        rect11.長方形面積();
        rect11.長方形周長();
    }

    ////////////////////////////////////////////////////////////////////////////
    public static void callProg10() {

        Human1 p1 = new Human1();
        p1.name = "AAA";
        p1.height = 160;
        p1.weight = 60;
        System.out.println("p1.name = " + p1.name);
        System.out.println("p1.height = " + p1.height);
        System.out.println("p1.weight = " + p1.weight);
        p1.eat(3);
        p1.run(5);

        System.out.println("");

        Human1 p2 = new Human1();
        p2.name = "BBB";
        p2.height = 180;
        p2.weight = 80;
        System.out.println("p2.name = " + p2.name);
        System.out.println("p2.height = " + p2.height);
        System.out.println("p2.weight = " + p2.weight);
        p2.eat(5);
        p2.run(10);

    }
    ////////////////////////////////////////////////////////////////////////////
    public static void callProg11() {

        Human2 p1 = new Human2();
        p1.setdata("aaa", 160, 60);
        p1.getdata();
        p1.eat(3);
        p1.run(5);

        System.out.println("");

        Human2 p2 = new Human2();
        p2.setdata("bbb", 180, 80);
        p2.getdata();
        p2.eat(5);
        p2.run(10);

    }
}
