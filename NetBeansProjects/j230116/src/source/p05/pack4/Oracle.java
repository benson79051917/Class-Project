package source.p05.pack4;

import source.p05.pack3.*;


public class Oracle implements Conn2{

    @Override
    public void conn() {
        System.out.println("Oracle-connect");
    }

    @Override
    public void close() {
        System.out.println("Oracle-close");
    }

    
    
}
