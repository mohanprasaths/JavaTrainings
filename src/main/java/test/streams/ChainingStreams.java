package test.streams;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class ChainingStreams {
    public static void main(String args[]){
        try {
            OutputStream out = new OutputStream();
            out.write(1);
        }catch (Exception e){
            System.out.println("out");
        }

        InputStream in = new InputStream();
        chainStreamer chainer = new chainStreamer(in.read(out));
        chainer.doSomething();

    }
}

class chainStreamer{


    public void doSomething(InputStream in) {
        char chBuff = new char[250];
        try(InputStreamReader inputStream = new InputStreamReader(in)){
            while(length = inputStream.read(chBuff)>=0){
                System.out.println(inputStream.read(chBuff));
            }
        }
    }
}
