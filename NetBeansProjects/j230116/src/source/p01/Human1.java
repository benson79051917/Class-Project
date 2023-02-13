package source.p01;


public class Human1 {
    
    public String name;
    public int height;
    public int weight;
    
    public void eat(int x) {
        System.out.println("eat " + x + " bowls");
    }
    
    public void run(int x) {
        System.out.println("Run " + x + " kms");
    }
    @Override
    public String toString() {
        return  name + " " + height + " " + weight;
    }
}
