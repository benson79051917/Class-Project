package source.p05;

public class Static02 {

    public int a;
    public static int b;

    public Static02() {
        super();
    }

    public void n1() {
        //自己
        a = 10;
        b = 20;
        n3();
        n4();
        //別人
        Static01.y = 123;
        Static01.m4();
        Static01 q = new Static01();
        q.x=456;
        q.m3();
        q.m2();
    }

    public static void n2() {
        //自己
        //x = 10;
        b = 20;
        //m3();
        n4();

        ///////
        Static02 p = new Static02();
        p.a = 123;
        p.n3();
        
        //別人
        Static01.y = 123;
        Static01.m4();
        Static01 q = new Static01();
        q.x=456;
        q.m3();
        q.m2();

    }

    public void n3() {
        a = 123;
        this.a = 123;
        b = 456;
        Static02.b = 456;

        n1();
        this.n1();
        n2();
        Static02.n2();

    }

    public static void n4() {
        //x = 123;
        //this.a = 123;
        b = 456;
        Static02.b = 456;

        //m1();
        //this.n1();
        n2();
        Static02.n2();
    }

}
