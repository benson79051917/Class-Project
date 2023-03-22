package source.p05;


public class Run {

    public String 名字;
    public int 公里數;
    public static int 總公里數;

    public void 跑(String n, int miles) {
        名字 = n;
        公里數 = miles;
        總公里數 = 總公里數 + miles;
        秀狀態();
    }

    public void 秀狀態() {

        System.out.println(名字);
        System.out.println("run" + 公里數 + "km");
        System.out.println("total distance" + 總公里數 + "km");
    }

    public static void 清除總公里數() {
        總公里數 = 0;
    }
}

