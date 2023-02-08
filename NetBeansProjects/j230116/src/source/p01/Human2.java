package source.p01;


public class Human2 {
    
    private String name;
    private int height;
    private int weight;
    
    public void eat(int x) {
        System.out.println("Eat " + x + " bowls");
    }
    
    public void run(int x) {
        System.out.println("Run " + x + " kms");
    }
    
    public void setdata(String n, int h, int w) {
        this.name = n;
        this.height =h;
        this.weight = w;
    }
    
    public void getdata() {
        System.out.println("name = " + name);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
    }
}
