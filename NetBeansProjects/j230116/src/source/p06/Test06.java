package source.p06;

public class Test06 {

    public static void useB001_1() {
        B001 p = new B001();
        p.a = 123;
        System.out.println(p.a);
        //p.b = 123;
        //System.out.println(p.b);
    }

    public static void 使用Account1() {

        String id = "111-22-3333";
        int money = 10000;

        Account1 MyAccount = new Account1();
        MyAccount.設定資料(id, money);

        System.out.println(" == 存入 5000 元後");
        MyAccount.存款(5000);
        System.out.println(" == 領出 20000 元後");
        MyAccount.提款(20000);
    }
    
    public static void 使用Account2() {
        String id = "111-22-3333";
        int money = 10000;

        Account2 MyAccount = new Account2();
        MyAccount.設定資料(id, money);

        System.out.println(" == 存入 50000 元後");
        MyAccount.存款(50000);

        System.out.println(" == 領出 20000 元後");
        MyAccount.提款(20000);

        System.out.println(" == 轉帳 80000 元後");
        MyAccount.轉帳(80000);
    }
}
