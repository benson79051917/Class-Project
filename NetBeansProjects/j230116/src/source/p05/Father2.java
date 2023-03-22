package source.p05;


public class Father2 {
    
    public void 麵店() {
        System.out.println("beef noodle");
    }
    
    public void 自助餐() {
        
    }
    
}

class Mother2 {
    
    public void 咖啡廳() {
        
    }
    
    public void 超市() {
        
    }
}

class Friend2 {
    
    public void 美容院() {
        
    }
    
}

class Son2 extends Father2{
    
    public void 飲料店() {
        System.out.println("red tea");
    }
    
    @Override
    public void 麵店() {
        System.out.println("pasta");
    }
    
}
