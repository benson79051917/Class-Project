package source.p01;

public class Human2 {

    private String name;
    private int height;
    private int weight;

    public void eat(int x) {
        System.out.println("eat" + x + "bows");
    }

    public void run(int y) {
        System.out.println("run" + y + "mile");
    }

    //我是跟外界溝通的管道 介面
    public void setdata(String n, int h, int w) {
        name = n;
        height = h;
        weight = w;
    }

    public void getdata() {
        System.out.println("名字 " + name);
        System.out.println("身高 " + height + "公分");
        System.out.println("體重 " + weight + "公斤");
    }

}
