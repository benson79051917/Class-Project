package source.p05;

//class Object{
//    
//}
public class Person4 {

    public String name;
    public int height;
    public int weight;
    public static int num;

    public Head4 head = new Head4();
    public static Say4 say = new Say4();

    public Person4() {
        super();
        num++;
    }

    public Person4(String n, int h, int w) {
        super();
        name = n;
        height = h;
        weight = w;
        num++;
    }

    public void showdata() {
        System.out.println("name = " + name);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("eye = " + head.eye);
        System.out.println("nose = " + head.nose);
        System.out.println("mouth = " + head.mouth);
        System.out.println("num = " + num);
    }

    @Override
    public String toString() {
        return "name=" + name + "\n"
                + "height=" + height + "\n"
                + "weight=" + weight + "\n"
                + "eye=" + head.eye + "\n"
                + "nose=" + head.nose + "\n"
                + "mouth=" + head.mouth + "\n"
                + "num=" + num + "\n";
    }

}

class Head4 {

    public String eye;
    public String nose;
    public String mouth;
}

class Say4 {

    public void iloveyou() {
        System.out.println("i love you");
    }

    public void ihateyou() {
        System.out.println("i hate you");
    }
}
