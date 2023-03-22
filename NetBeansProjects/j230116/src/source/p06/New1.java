package source.p06;

import source.p06.pack2.New3;

public class New1 {

    public void useNew2() {
        New2 a = new New2();
        a.x = 123;
        a.y = 456;
        a.s1();
        //a.s2();
    }

    public void useNew3() {
        New3 a = new New3();
        a.x = 123;
        //a.y = 456;
        //a.s1();
        //a.s2();
    }
}
