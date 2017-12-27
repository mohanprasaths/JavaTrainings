package test.streams;

import java.io.*;

public class FileAndBufferedStream {
    public static void main(String args[]) throws IOException {
        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
        CustomFileWriter cwriter = new CustomFileWriter("./output.txt");
        cwriter.WriteIntoFile("ironman");
        cwriter.WriteIntoFile("flash");
        cwriter.WriteIntoFile("batman");
        cwriter.close();
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

class CustomFileWriter{
    BufferedWriter bw ;
    CustomFileWriter(String filename){
        try{
            this.bw = new BufferedWriter(new FileWriter(filename));
        }catch(Exception e){

        }
    }
    public void WriteIntoFile(String content) throws IOException {
        try {
            this.bw.write(content);
            this.bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() throws IOException {
        this.bw.close();
    }
}