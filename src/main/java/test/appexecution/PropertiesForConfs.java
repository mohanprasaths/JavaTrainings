package test.appexecution;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesForConfs {
    public static void main(String args[]) throws IOException {
        Properties myProp = new Properties();
        myProp.setProperty("name","mohan");
        myProp.setProperty("age","23");
        try(Writer writer = Files.newBufferedWriter(Paths.get("xyz.properties"))){
            myProp.store(writer,"mohan commit");
        }
        Properties myReadProps = new Properties();
        try(Reader reader = Files.newBufferedReader(Paths.get("xyz.properties"))){
            myReadProps.load(reader);
        }args
        Enumeration<Object> myKeys = myReadProps.keys();
        while(myKeys.hasMoreElements()){
            String key = (String)myKeys.nextElement();
            System.out.println(myReadProps.get(key));
        }
    }
}

