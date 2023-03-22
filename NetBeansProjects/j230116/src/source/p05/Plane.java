package source.p05;

public class Plane {

    public int 速度;
    public int 載重;

    public void 起飛() {
        速度 = 10;
        載重 = 1000;
        System.out.println("plane - speed : " + 速度);
        System.out.println("plane - loading : " + 載重);
    }

    public void 降落() {

    }
}
