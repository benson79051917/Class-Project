package source.p05.pack3;


public class Mysql extends Conn1{

    @Override
    public void conn() {
        System.out.println("MySQL-connect");
    }

    @Override
    public void close() {
        System.out.println("MySQL-close");
    }

    
    
}
