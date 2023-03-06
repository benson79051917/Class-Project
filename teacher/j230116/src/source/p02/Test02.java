package source.p02;

import java.util.Scanner;
import javax.swing.JOptionPane;
import source.p01.Human1;

public class Test02 {

    public static void callprog1() {
        int x;
        int a, b, c;

        int m = 1;
        int p = 1, q = 2, r = 3;
    }

    public static void callprog2() {
        int a123;
        int $123;
        int _123;
        int 金額;

//        int 123;
//        int #123;
//        int -123;
//        int float;
    }

    public static void 兩數交換() {
        int var1, var2, var3, var4;
        int tmp;

        var1 = 100;
        var2 = 200;

        var3 = 100;
        var4 = 200;

        System.out.println("交換前 var1 = " + var1 + "  var2 = " + var2);
        tmp = var1;
        var1 = var2;
        var2 = tmp;
        System.out.println("交換後 var1 = " + var1 + "  var2 = " + var2);

        System.out.println("交換前 var3 = " + var3 + "  var4 = " + var4);
        tmp = var3;
        var3 = var4;
        var4 = tmp;
        System.out.println("交換後 var3 = " + var3 + "  var4 = " + var4);

    }

    public static void callprog3() {
        byte a1 = -128;
        short a2 = 32767;
        int a3 = 2147483647;
        long a4 = 2147483644444L;
        float b1 = 123;
        float b2 = 3.14f;
        double b3 = 123.45;
        double b4 = 123.45D;
        char c1 = 'A';
        char c2 = 66;
        System.out.println("c2=" + c2);
        char c3 = 123;
        boolean d1 = true;
        //  boolean d2=123;
    }

    public static void callprog4() {

        int a1 = Integer.parseInt("123"); //123
        double a2 = Double.parseDouble("123.456"); //123.456

        String b1 = Integer.toString(123); //"123"
        String b2 = Double.toString(123.456); //"123.456"

        char c1 = Character.toUpperCase('a'); //'A'
        char c2 = Character.toLowerCase('A'); //'a'
    }

    public static void callprog5() {
        Human1 p1 = new Human1();
        p1.name = "aaa";
        p1.height = 162;
        p1.weight = 50;

        System.out.println(p1);

    }

    public static void callprog6() {
        B001 p = new B001();
        p.abc();

    }

    public static void callprog7() {
        String str1 = new String("abc");
        //或
        String str2 = "abc";
        str2.concat("xyz");
        System.out.println("str2=" + str2); //"abc"

        str2 = str2.concat("xyz");
        System.out.println("str2=" + str2); //"abcxyz"

        StringBuilder str4 = new StringBuilder("abc");
        str4.append("xyz");
        System.out.println("str4=" + str4); //"abcxyz"

    }

    public static void callprog8() {
        C001 c = new C001("xyz");
        System.out.println(c);
    }

    public static void 其他類別_系統提供() {
        Scanner s = new Scanner("ab,cd").useDelimiter(",");

        System.out.println(s.next()); //"ab"
        System.out.println(s.next()); //"cd"
    }

    public static void 其他類別_使用者自訂() {
        Human1 人1 = new Human1();
        人1.name = "aaa";
        人1.height = 162;
        人1.weight = 50;
        System.out.println("人1=" + 人1); //位址
        System.out.println("人1.名字=" + 人1.name); //值
    }

    public static void 列舉型別() {
        boolean x = true;
        System.out.println(x);

        ColorX color = ColorX.ORANGE;
        System.out.println(color);
    }

    public static void 變數分類二_內容能否變化() {
        //等號右邊是常數
        int x1 = 4;
        String x2 = "abc";
        char x3 = 'A';
        boolean x4 = true;

        //變數
        int y1 = 4;
        y1 = 5;
        y1 = 6;
        //常數的變數
        final double PI = 3.14159;
        //PI = 3.14;   //錯誤，不可再次設定其值
        final int NUM; // final 區域變數，定義時允許不初始化
        NUM = 18;
        // NUM = 20;
        System.out.println(NUM);
    }

    public static void 變數分類三_值與址() {
        int a1 = 123;
        double a2 = 75.6;
        char a3 = 'A';
        boolean a4 = true;
        System.out.println("a1=" + a1); //值 123
        System.out.println("a2=" + a2); //值 75.6
        System.out.println("a3=" + a3); //值 'A' 
        System.out.println("a4=" + a4); //值  true
        ////////////////////////////////////
        int[] ar1 = new int[3];
        ar1[0] = 10;
        ar1[1] = 20;
        ar1[2] = 30;
        System.out.println("ar1=" + ar1); //址  [I@659e0bfd
        /////////////////////////////////////
        Integer b1 = 123;
        Double b2 = 123.45;
        System.out.println("b1=" + b1); //值 ,特 123
        System.out.println("b2=" + b2); //值 ,特 123.45

        /////////////////////////////////////
        String c1 = new String("abc");
        StringBuffer c2 = new StringBuffer("abc");
        StringBuilder c3 = new StringBuilder("abc");
        System.out.println("c1=" + c1); //值 ,特 "abc"
        System.out.println("c2=" + c2); //值 ,特 "abc"
        System.out.println("c3=" + c3); //值 ,特 "abc"

        Human1 人1 = new Human1();
        人1.name = "aaa";
        人1.height = 162;
        人1.weight = 50;
        System.out.println("人1.名字=" + 人1.name); //值,特 "賴玉珊"
        System.out.println("人1=" + 人1); //值,特 "賴玉珊 162 50"==>toString()覆寫
    }

    public static void 進位表示法與底線() {
        int a1 = 70;
        int a2 = 070;
        int a3 = 0x70;
        int a4 = 0b0100_0110;
        System.out.println("a1=" + a1); //70
        System.out.println("a2=" + a2); //56
        System.out.println("a3=" + a3); //112
        System.out.println("a4=" + a4); //70

        int b1 = 1234_5678;
        double b2 = 123.456_789;
        System.out.println("b1=" + b1); //12345678
        System.out.println("b2=" + b2); //123.456789

        long c1 = 0b0000101001110011L;
        long c2 = 0b0000_1010_0111_0011L;
        System.out.println("c1=" + c1); //2675
        System.out.println("c2=" + c2); //2675
    }

    public static void 底線_注意() {

        //int x1 = _52;       
        //int x2 = 52_; 
        //float x3 = 3_.1415F; 
        //float x4 3._1415F; 
        //long x5 = 999_99_9999_L;
        //long x6 = 999_99_9999L_;       
        //int x7 = 0_x52 ;
        //int x8 = 0x_52; 
        //int x9 = _0x52; 
        int x10 = 5_______2;
        int x11 = 0x5_2;
        int x12 = 0_52;
        int x13 = 05_2;
        int x14 = 5_2;
    }

    public static void 修飾字() {
        long a1 = 2000;
        long a2 = 2147483647;
        long a3 = 2147483648L;   // 超出整數範圍 才需 加上 L

        float b1 = 4.5F; // float 一定要加 F
        float b2 = 5;
        System.out.println(b2);

        double c1 = 5.8; // double 可加 D 也可不加
        double c2 = 6.5D;
    }

    public static void callprog9() {
        int x1 = 123;
        long y1 = 123L;
        y1 = x1;

        int x2 = 123;
        long y2 = 123L;
        x2 = (int) y2;

    }

    public static void 基本轉基本_注意1() {
        long b1 = 2147483648L;
        float b2 = 4.5f;

        long b3 = 2147483648L;
        float b4 = 4.5f;

        b2 = b1;        //自然轉型  

        b3 = (long) b4;//強迫轉型
        System.out.println(b3);// 得到 4 , 小數會被捨掉
    }

    public static void 基本轉基本_注意2() {
        byte c1 = 4;
        char c2 = 'A';

        byte c3 = 4;
        char c4 = 'A';

        c1 = (byte) c2;  //byte 與 char 要 互相轉型
        c4 = (char) c3;  //byte 與 char 要 互相轉型
    }

    public static void callprog10() {
        VarDemo6 a = new VarDemo6();
        VarDemo7 b = new VarDemo7();

        VarDemo6 c = new VarDemo6();
        VarDemo7 d = new VarDemo7();

        a = b;
        c = a;

    }

    public static void 參考轉參考_不同類型要有繼承關係() {
        VarDemo6 c1 = new VarDemo6();  //父      
        VarDemo7 d1 = new VarDemo7();  //子
        c1 = d1;   //有繼承關係 小轉大
        VarDemo6 c2 = new VarDemo6();  //父
        VarDemo7 d2 = new VarDemo7();  //子
        d2 = (VarDemo7) c2; //有繼承關係 大轉小
    }

    public static void 參考轉參考_不同類型要有繼承關係1() {

        VarDemo6 c2 = new VarDemo7();  //父
        VarDemo7 d2 = new VarDemo7();  //子
        d2 = (VarDemo7) c2; //有繼承關係 大轉小
    }

    public static void 參考轉參考_系統API() {
        String s1 = "abc";
        String s2 = "xyz";
        StringBuffer s3 = new StringBuffer("abc");
        s1 = s2;
        // s1 = s3;  //不同型態 , 又沒有繼承關係   
    }

    public static void 參考轉參考_陣列() {
        int[] ar1 = new int[5];
        int[][] ar2 = new int[2][3];
        // ar1 = ar2;  //一維對二維不行
        // ar2 = ar1;  //一維對二維不行
        ar1 = ar2[0];  //址
        ar1[0] = ar2[0][0];  //值
    }

    public static void 字串轉數字() {

        int a1 = Integer.parseInt("2100");  //String 轉成 int   
        double a2 = Double.parseDouble("88.8");  //String 轉成 double

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
    }

    public static void 數字轉字串() {
        String str1, str2, str3, str4;

        str1 = Integer.toString(1000); // int 轉成 String
        str2 = Character.toString('k'); // char 轉成 String
        str3 = Double.toString(199.77); // double 轉成 String
        str4 = Boolean.toString(false); // boolean 轉成 String

        str1 = String.valueOf(1000); // int 轉成 String
        str2 = String.valueOf('k');  // char 轉成 String
        str3 = String.valueOf(199.77); // double 轉成 String
        str4 = String.valueOf(false); // boolean 轉成 String
    }

    public static void scanner1() {
        int x;
        Scanner a = new Scanner(System.in);
        System.out.print("x=");
        x = a.nextInt();
        System.out.println("---->x=" + x);
    }

    public static void scanner2() {
        String x;
        Scanner a = new Scanner(System.in, "big5");
        System.out.print("x=");
        x = a.next();
        System.out.println("---->x=" + x);
    }
      public static void j0211() {
        String msg;
      
      //  msg = JOptionPane.showInputDialog(null, "message：");
        msg = JOptionPane.showInputDialog(null, "message：","我是標題",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "message" + msg);
    }
 public static void j0212() {
        int msg;
      
      //  msg = JOptionPane.showInputDialog(null, "message：");
        msg = Integer.parseInt(JOptionPane.showInputDialog(null, "message：","我是標題",JOptionPane.INFORMATION_MESSAGE));
        JOptionPane.showMessageDialog(null, "message" + msg);
    }
}
