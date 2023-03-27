package source.p07;

public class Test07 {

    public static void 加1_傳值() {

        int x = 4;
        int y = 5;

        System.out.println("傳值加1前 x=" + x + " y=" + y);
        傳值(x, y);
        System.out.println("傳值加1後 x=" + x + " y=" + y);
    }

    public static void 傳值(int x, int y) {
        x = x + 1;
        y = y + 1;
    }

    public static void 加1_傳址() {
        TwoNum a = new TwoNum();
        a.x = 4;
        a.y = 5;
        System.out.println("before + 1 -> a.x = " + a.x + ", a.y = " + a.y);
        傳址(a);
        System.out.println("after + 1 -> a.x = " + a.x + ", a.y = " + a.y);
    }

    public static void 傳址(TwoNum p) {
        p.x = p.x + 1;
        p.y = p.y + 1;
    }

    ///////////////////////////////////////////////////////////////////////////////
    public static void 傳址_變數() {
        TwoNum a = new TwoNum();  //a.x  a.y
        a.x = 4;
        a.y = 5;
        System.out.println("a.x=" + a.x + " a.y=" + a.y);  //4 ,5

        TwoNum b;
        b = a;
        //b = new TwoNum();
        System.out.println("b.x=" + b.x + " b.y=" + b.y);  //4 ,5
    }

/////////////////////////////////////////////////////////////////////////////
    public static void 傳址_參數() {
        TwoNum a = new TwoNum();
        a.x = 4;
        a.y = 5;
        System.out.println("a.x=" + a.x + " a.y=" + a.y); //4,5
        接收址(a);
    }

    public static void 接收址(TwoNum b) {
        //  b = new TwoNum();
        System.out.println("b.x=" + b.x + " b.y=" + b.y); //4,5
    }

/////////////////////////////////////////////////////////////////////////////
    public static void 傳址_不同的變數() {
        TwoNum a = new TwoNum();  //a.x  a.y
        a.x = 4;
        a.y = 5;
        System.out.println("a.x=" + a.x + " a.y=" + a.y);  //4 ,5

        TwoNum b;
        b = a;

        b.x = 10;
        b.y = 20;
        System.out.println("a.x=" + a.x + " a.y=" + a.y); //10,20
    }

    public static void 傳址_多型1() {
        Dog7 dog = new Dog7();
        Cat7 cat = new Cat7();
        Bird7 bird = new Bird7();
        接收址1(dog);
        接收址1(cat);
        接收址1(bird);
    }

    public static void 接收址1(Dog7 d) {
        d.叫();
    }

    public static void 接收址1(Cat7 d) {
        d.叫();
    }

    public static void 接收址1(Bird7 d) {
        d.叫();
    }

    public static void 傳址_多型2() {
        Call7 dog = new Dog7();
        Call7 cat = new Cat7();
        Call7 bird = new Bird7();
        接收址2(dog);
        接收址2(cat);
        接收址2(bird);
    }

    public static void 接收址2(Call7 d) {
        d.叫();
        if (d instanceof Bird7) {
            d.叫();
            ((Bird7) d).飛();
        }
    }

    public static void 傳址_多型3() {
        Call7 a = null;
        a = new Dog7();
        接收址3(a);
        a = new Cat7();
        接收址3(a);
        a = new Bird7();
        接收址3(a);
    }

    public static void 接收址3(Call7 d) {
        d.叫();
        if (d instanceof Bird7) {
            d.叫();
            ((Bird7) d).飛();
        }
    }

    ///////////////////////////////////////////////////////////////
    public static void 回傳1() {
        //回傳 值
        int sum;
        int x = 4;
        int y = 5;
        sum = 回傳1_值(x, y);
        System.out.println("sum=" + sum);
        //回傳 址
        TwoNum a = null;
        a = 回傳1_址();
        System.out.println("a.x=" + a.x + " a.y=" + a.y);
    }

    public static int 回傳1_值(int x, int y) {
        return x + y;
    }

    public static TwoNum 回傳1_址() {
        TwoNum a = new TwoNum();
        a.x = 10;
        a.y = 20;
        return a;
    }
    
    public static void 工廠函數() {
        //1
        A001 a = A001.getA001Instance();
        
        //2
        A001 b = A001.getA001Instance();
        
        //3
        A001 c = ClassManager.getA001Instance();
        
        //4
        ClassManager q = new ClassManager();
        A001 d = q.creatA001Instance();
    }
    
    public static void 回傳2_址() {
        Call7 ani;
        ani = GetCall7.getDog7Instance();
        ani.叫();
        ani = GetCall7.getCat7Instance();
        ani.叫();
        ani = GetCall7.getBird7Instance();
        ani.叫();
    }
    
}
