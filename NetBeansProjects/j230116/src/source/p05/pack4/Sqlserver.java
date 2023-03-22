package source.p05.pack4;

import source.p05.pack3.*;


public class Sqlserver implements Conn2{

    @Override
    public void conn() {
        System.out.println("Sqlserver-connect");
    }

    @Override
    public void close() {
        System.out.println("Sqlserver-close");
    }

    
    
}
