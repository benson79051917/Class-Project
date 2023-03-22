package source.p05;


public abstract class Father3 {
    
    public void 麵店() {
        System.out.println("beef noodle");
    }
    
    public abstract void 自助餐();
    
}

class Mother3 {
    
    public void 咖啡廳() {
        
    }
    
    public void 超市() {
        
    }
}

class Friend3 {
    
    public void 美容院() {
        
    }
    
}

class Son3 extends Father3{
    
    public void 飲料店() {
        System.out.println("red tea");
    }
    
    @Override
    public void 麵店() {
        System.out.println("pasta");
    }
    
    @Override
    public void 自助餐() {
        System.out.println("buffet");
    }
    
}
