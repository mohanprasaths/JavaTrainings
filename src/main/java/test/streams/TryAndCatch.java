package test.streams;

import java.io.IOException;
import java.io.Reader;

public class TryAndCatch {
    public static  void main(String args){
        try(AutoClose ac = new Autoclose()){
            ac.saySomething();
        }catch (Exception e){

        }
    }
}

interface Autoclose  implements AutoCloseable{
    public void saySomething throws IOException(){
        System.out.println("Hi there");
    }
    @Override
    public void close() throws IOException{
        System.out.println("close");
    }
}