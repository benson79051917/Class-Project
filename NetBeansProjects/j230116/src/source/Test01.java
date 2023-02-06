package source;

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
        String x ="aaa";
        String y ="bbb";
        String z ="ccc";
        list(x);
        list(y);
        list(z);
    }

    public static void list(String s) {
        System.out.println("ooo" + s + "xxx");
    }
    ////////////////////////////////////////////////////////////////////////////

}
