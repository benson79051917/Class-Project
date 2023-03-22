package source.p05;

public class Aircraft extends Plane {
    
    public double 載重;
    
    public void 超光速飛行() {
        速度 = 10000;
        System.out.println("Aircraft - speed =" + 速度);
    }

    public void 起飛() {
        載重 = 500.0;
        速度 = 10000;
        System.out.println("Aircraft - speed " + 速度);
        System.out.println("Aircraft - loading " + 載重);
    }
    
    public void 光速傳送() {
        
    }
}
