package source.p05.pack4;

import source.p05.pack3.*;


public class Mysql implements Conn2{

    @Override
    public void conn() {
        System.out.println("MySQL-connect");
    }

    @Override
    public void close() {
        System.out.println("MySQL-close");
    }

    
    
}
