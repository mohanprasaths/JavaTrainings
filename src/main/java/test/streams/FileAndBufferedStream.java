package test.streams;

import java.io.*;

public class FileAndBufferedStream {
    public static void main(String args[]) throws IOException {
        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
        CustomFileReader cw = new CustomFileReader("./output.txt");
        cw.ReadIFromFile();
    }
}

class CustomFileReader  {
    BufferedReader outputStream;
    CustomFileReader(String filename) {
        try {
            this.outputStream = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void ReadIFromFile() throws IOException {
        String inValue;
        while((inValue=this.outputStream.readLine()) != null){
            System.out.println(inValue);
        }
    }
}

