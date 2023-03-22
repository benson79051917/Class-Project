package source.p05;

import java.util.Date;
import source.p05.pack1.Import1;
//import static source.p05.pack1.Import4.x;
//import static source.p05.pack1.Import4.s1;
import static source.p05.pack1.Import4.*;


public class Test05 {

    public static void 接力賽() {
        Run dad1 = new Run();
        dad1.跑("dad1", 10);
        dad1.秀狀態();
        Run eb1 = new Run();
        eb1.跑("eb1", 20);
        Run yb1 = new Run();
        eb1.跑("yb1", 30);
        Run.清除總公里數();
        
        Run dad2 = new Run();
        dad1.跑("dad2", 10);
        dad1.秀狀態();
        Run eb2 = new Run();
        eb1.跑("eb2", 20);
        Run yb2 = new Run();
        eb1.跑("yb2", 30);
        Run.清除總公里數();
        
    }

    public static void import的用法() {
        //1.
        Import1 a = new Import1();
        a.x = 10;
        a.s1();
        
        //2.
        source.p05.pack1.Import2 b = new source.p05.pack1.Import2();
        b.x = 123;
        b.s1();
        source.p05.pack2.Import2 c = new source.p05.pack2.Import2();
        c.x = 123;
        c.s1();
        
        //複習
        source.p05.pack1.Import3.x = 123;
        source.p05.pack1.Import3.s1();
        
        //3.
        x = 123;
        s1();
        //source.p05.pack1.Import4.x=123;
        //source.p05.pack1.Import4.s1();
    }
        
    public static void 連接資料庫1() {
        source.p05.pack3.Mysql a = new source.p05.pack3.Mysql();
        a.conn();
        a.close();
        
        source.p05.pack3.Oracle b = new source.p05.pack3.Oracle();
        b.conn();
        b.close();
        
        source.p05.pack3.Sqlserver c = new source.p05.pack3.Sqlserver();
        c.conn();
        c.close();
    }
    
    public static void 連接資料庫1_1() {
        source.p05.pack3.Conn1 a = new source.p05.pack3.Mysql();
        a.conn();
        a.close();
        
        source.p05.pack3.Conn1 b = new source.p05.pack3.Oracle();
        b.conn();
        b.close();
        
        source.p05.pack3.Conn1 c = new source.p05.pack3.Sqlserver();
        c.conn();
        c.close();
    }
    
    public static void 連接資料庫2() {
        source.p05.pack4.Mysql a = new source.p05.pack4.Mysql();
        a.conn();
        a.close();
        
        source.p05.pack4.Oracle b = new source.p05.pack4.Oracle();
        b.conn();
        b.close();
        
        source.p05.pack4.Sqlserver c = new source.p05.pack4.Sqlserver();
        c.conn();
        c.close();
    }
    
    public static void 連接資料庫3() {
        source.p05.pack4.Conn2 a;
        a = new source.p05.pack4.Mysql();
        a.conn();
        a.close();
        
        a = new source.p05.pack4.Oracle();
        a.conn();
        a.close();
        
        a = new source.p05.pack4.Sqlserver();
        a.conn();
        a.close();
    }
    
    public static void 類別之間的關係() {
        Son2 p =new Son2();
        p.麵店();
        
    }
    
    public static void 由類別產生物件1() {
        Person1 p1 = new Person1();
        p1.name = "AAA";
        p1.height = 183;
        p1.weight = 70;
        Person1.num++;
        p1.showdata();
        Person1.iloveyou();
        System.out.println(p1 instanceof Person1);
        System.out.println(p1.getClass().getName());
        
        System.out.println("================================");
        
        Person1 p2 = new Person1();
        p2.name = "BBB";
        p2.height = 175;
        p2.weight = 80;
        Person1.num++;
        p2.showdata();
        Person1.iloveyou();
        System.out.println(p2 instanceof Person1);
        System.out.println(p2.getClass().getName());
    }
    
    public static void 由類別產生物件1_1() {
        Person1_1 p1 = new Person1_1("aaa", 162, 50);

        p1.showdata();
        Person1_1.iloveyou();
        System.out.println(p1 instanceof Person1_1);
        System.out.println(p1.getClass().getName());
        
        System.out.println("================================");
        
        Person1_1 p2 = new Person1_1("bbb", 172, 80);

        p2.showdata();
        Person1_1.iloveyou();
        System.out.println(p2 instanceof Person1_1);
        System.out.println(p2.getClass().getName());
        
        System.out.println("================================");
        
        Person1_1 p3 = new Person1_1();

        p3.showdata();
        Person1_1.iloveyou();
        System.out.println(p3 instanceof Person1_1);
        System.out.println(p3.getClass().getName());
    }
    
    public static void 由類別產生物件2() {
        Person2 p1;
        p1 = new Person2("AAA", 185, 70);
        p1.showdata();
        Person2.iloveyou();
        
        System.out.println("==================================");
        
        Person2 p2;
        p2 = new Person2("BBB", 171, 60);
        p2.showdata();
        Person2.iloveyou();
        
        System.out.println("==================================");
        
        Person2 p3 = new Person2();
        p3.showdata();
        Person2.iloveyou();
        
    }
    
    public static void 由類別產生物件4() {
        Person4 p1 = new Person4();
        p1.name = "aaa";
        p1.height = 183;
        p1.weight = 80;
        p1.head.eye = "blue";
        p1.head.nose = "big";
        p1.head.mouth = "long";
        //p1.showdata();
        System.out.print(p1);
        Person4.say.iloveyou();
        Person4.say.ihateyou();
    }
    
    public static void 物件的內容() {

        Person2 p1 = new Person2("賴玉珊", 162, 50);   //自訂類別     
        int[] ar1 = new int[5]; //陣列

        StringBuffer str1 = new StringBuffer("abc");  //StringBuffer
        StringBuilder str2 = new StringBuilder("xyz"); //StringBuilder
        Integer num1 = 123;  //八個包裝類別
        Double num2 = 456.78;
        Date d1 = new Date(); //日期
        System.out.println("人1=" + p1);
        System.out.println("ar1=" + ar1);
        System.out.println("str1=" + str1);
        System.out.println("str2=" + str2);
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
        System.out.println("d1=" + d1);
    }
    
    public static void 繼承1() {
        Plane a1 = new Plane();
        a1.起飛();
        Airplane a2 = new Airplane();
        a2.起飛();
        Aircraft a3 = new Aircraft();
        a3.超光速飛行();
        a3.起飛();
    }
    
    public static void 繼承2() {
        Plane a1 = new Plane();
        a1.起飛();
        Plane a2 = new Airplane();
        a2.起飛();
        Plane a3 = new Aircraft();
        
        a3.起飛();
        ((Aircraft)a3).超光速飛行();
        
    }
    
    public static void 繼承3() {
        Plane a1;
        a1 = new Plane();
        a1.起飛();
        a1 = new Airplane();
        a1.起飛();
        a1 = new Aircraft();
        a1.起飛();
    }
    
    public static void 繼承4() {
        Plane [] ar1 = {new Plane(), new Airplane(), new Aircraft()};
        for(Plane a: ar1) {
            a.起飛();
        }
    }
    
    public static void instance的關係1() {
        Dog5 p = new Dog5();
        System.out.println("p instancof Dog5 = " + (p instanceof Dog5));
        System.out.println("p instancof Animal5 = " + (p instanceof Animal5));
        //System.out.println("p instancof Cat5 = " + (p instanceof Cat5));
    }
    
    public static void instance的關係2() {
        //Animal1 是父類別 , Dog1 是子類別
        Dog5 p = new Dog5();
        呼叫instance的關係(p);
    }

    //Compiler 時 會認為 p 是 Object 的型態 與 Cat5 有繼承關係
    //run 時才會挖出 p 真正的內容是 Dog5     
    public static void 呼叫instance的關係(Object p) {
        System.out.println("p instanceof Dog5 =" + (p instanceof Dog5));  //兒子 - true
        System.out.println("p instanceof Animal5 =" + (p instanceof Animal5));  //父親 - true        
        System.out.println("p instanceof Cat5 =" + (p instanceof Cat5)); //不相關 -false
    }
    
}
