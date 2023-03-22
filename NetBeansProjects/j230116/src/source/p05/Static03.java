package source.p05;

public class Static03 extends Static01{

    public int a;
    public static int b;

    public Static03() {
        super();
    }

    public void n1() {
        //自己
        a = 10;
        b = 20;
        n3();
        n4();
        
        //爸
        x = 123;
        super.x =123;
        this.x = 123;
        
        y=123;
        Static01.y = 123;
        Static03.y = 123;
        super.y = 123;
        this.y = 123;
        
        m1();
        super.m1();
        this.m1();
        
        m2();
        Static01.m2();
        Static03.m2();
        super.m2();
        this.m2();
        
    }

    public static void n2() {
        //自己
        //x = 10;
        b = 20;
        //m3();
        n4();

        ///////
        Static03 p = new Static03();
        p.a = 123;
        p.n3();
        
        //爸
        y= 123;
        Static01.y= 123;
        Static03.y = 123;
        
        m4();
        Static01.m4();
        Static03.m4();
        
        p.x = 123;
        p.m3();
        

    }

    public void n3() {
        a = 123;
        this.a = 123;
        b = 456;
        Static03.b = 456;

        n1();
        this.n1();
        n2();
        Static03.n2();

    }

    public static void n4() {
        //x = 123;
        //this.a = 123;
        b = 456;
        Static03.b = 456;

        //m1();
        //this.n1();
        n2();
        Static03.n2();
    }

}
