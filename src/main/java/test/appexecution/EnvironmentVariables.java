package test.appexecution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EnvironmentVariables {
    public static void main(String args[]){
        Map<String,String> env = System.getenv();
        Set myArray = (Set) env.keySet();
        Iterator iter = myArray.iterator();
        while(iter.hasNext()){
            String keyName = (String)iter.next();
            System.out.println(keyName + "  -->  "+ env.get(keyName));
        }
    }
}
