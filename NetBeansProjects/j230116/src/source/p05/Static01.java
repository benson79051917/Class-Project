package source.p05;

public class Static01 {

    public int x;
    public static int y;

    public Static01() {
        super();
    }

    public void m1() {
        x = 10;
        y = 20;
        m3();
        m4();
    }

    public static void m2() {
        //x = 10;
        y = 20;
        //m3();
        m4();

        ///////
        Static01 p = new Static01();
        p.x = 123;
        p.m3();

    }

    public void m3() {
        x = 123;
        this.x = 123;
        y = 456;
        Static01.y = 456;

        m1();
        this.m1();
        m2();
        Static01.m2();

    }

    public static void m4() {
        //x = 123;
        //this.x = 123;
        y = 456;
        Static01.y = 456;

        //m1();
        //this.m1();
        m2();
        Static01.m2();
    }

}
