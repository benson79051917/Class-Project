package source.p05;

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
}
