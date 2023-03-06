package source.p01;

public class Human1 {

    public String name;
    public int height;
    public int weight;

    public void eat(int x) {
        System.out.println("eat" + x + "bows");
    }

    public void run(int y) {
        System.out.println("run" + y + "mile");
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }

    
    
    
}
