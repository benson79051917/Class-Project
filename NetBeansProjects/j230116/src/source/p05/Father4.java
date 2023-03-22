package source.p05;


public abstract class Father4 {
    
    public void 麵店() {
        System.out.println("beef noodle");
    }
    
    public abstract void 自助餐();
    
}

interface Mother4 {
    
    void 咖啡廳();
    
    void 超市();
}

interface Friend4 {
    
    void 美容院();
    
}

class Son4 extends Father4 implements Mother4, Friend4{
    public void 飲料店() {
        System.out.println("red tea");
    }
    
    @Override
    public void 麵店() {
        System.out.println("pasta");
    }
    
    @Override
    public void 自助餐() {
        System.out.println("buffei");
    }

    @Override
    public void 咖啡廳() {
        System.out.println("latte");
    }

    @Override
    public void 超市() {
        System.out.println("daily necessities");
    }

    @Override
    public void 美容院() {
        System.out.println("wash head");
    }

}

