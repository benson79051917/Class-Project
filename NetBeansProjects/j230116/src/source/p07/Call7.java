package source.p07;

public interface Call7 {

    void 叫();
}

abstract class Animal7 {

    public abstract void 叫();
}

class Dog7 implements Call7 {

    public void 叫() {
        System.out.println("dog shut");
    }
}

class Cat7 implements Call7 {

    public void 叫() {
        System.out.println("cat shut");
    }
}

class Bird7 implements Call7 {

    public void 叫() {
        System.out.println("bird shut");
    }

    public void 飛() {
        System.out.println("bird fly");
    }
}
