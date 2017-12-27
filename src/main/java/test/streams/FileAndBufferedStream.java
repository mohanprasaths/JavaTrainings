package test.streams;

import java.io.*;

public class FileAndBufferedStream {
    public static void main(String args[]){
        CustomFileWriter cw = new CustomFileWriter("output.txt");
    }
}

class CustomFileWriter  {
    BufferedReader outputStream;
    CustomFileWriter(String filename) {
        try {
            this.outputStream = new BufferedReader(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void WriteInFile(String content){

    }
}