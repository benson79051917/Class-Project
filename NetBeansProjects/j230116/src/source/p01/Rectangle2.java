package source.p01;

public class Rectangle2 {

    private int 長;
    private int 寬;

    public void 長方形面積() {
        int 面積;
        面積 = 長 * 寬;
        System.out.println("area=" + 面積);
    }

    public void 長方形周長() {
        int 周長;
        周長 = (長 + 寬) * 2;
        System.out.println("len=" + 周長);
    }

    public void set長(int 長, int 寬) {
        this.長 = 長;
        this.寬 = 寬;
    }
    
}
