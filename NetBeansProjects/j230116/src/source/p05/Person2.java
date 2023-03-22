package source.p05;

//class Object{
//    
//}
public class Person2 {
    
    public String name;
    public int height;
    public int weight;
    public static int num;
    
    public Person2() {
        super();
        num++;
    }
    
    public Person2(String n, int h, int w) {
        super();
        name = n;
        height = h;
        weight = w;
        num++;
    }
    
    public static void iloveyou() {
        System.out.println("i love you");
    }
    
    public void showdata() {
        System.out.println("name = " + name);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("num = " + num);
    }
    
}
