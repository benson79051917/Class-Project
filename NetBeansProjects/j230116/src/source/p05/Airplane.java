package source.p05;

public class Airplane extends Plane{

    public int 載客人數;
    public double 載重;  //遮蔽

    public void 客艙服務() {
        System.out.println("Service");
    }

    public void 起飛() {//覆蓋
        速度 = 100;
        載重 = 10000.0;
        System.out.println("Airplane - speed " + 速度);
        System.out.println("Airplane - loading " + 載重);
    }
}
