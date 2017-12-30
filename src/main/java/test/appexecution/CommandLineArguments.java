package test.appexecution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.*;

public class CommandLineArguments {
    public static void main(String args[]){
        String filename;
        if(args.length <= 0){
            System.out.println("no command line arguments");
            return;
        }else{
            filename = args[0];
        }
        if(exists(Paths.get(filename))){
            try(BufferedReader bd = newBufferedReader(Paths.get(args[0]))) {
                try {
                    String line = null;
                    while((line = bd.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finally {
                    bd.close();
                    return;
                }
            }
            catch (Exception e){
                System.out.println("Problem with file reading");
            }
        }
        System.out.println("File not exists");
    }
}
