package test.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Maps {
    public static void main(String argsp[]){
        Map<String,String> myMap = new HashMap<String,String>();
        myMap.put("1","hellow");
        myMap.put("2","there");
        myMap.put("3","welcome !!!");
        myMap.put("4","kk");
        myMap.forEach((k,v) -> System.out.println(k+" | "+"v"));


        SortedMap<String,String> mySortedMap = new TreeMap<>();
        mySortedMap.put("22222","hello");
        mySortedMap.put("33333","dasdasdas");
        mySortedMap.put("4444","dadads");
        mySortedMap.put("111","dasdadas");
        mySortedMap.put("78","lkjolk");
        mySortedMap.put("99","lkmlkm");
        SortedMap<String,String> myHeadMap = mySortedMap.tailMap("111");
        myHeadMap.forEach((k,v) -> System.out.println(k.toUpperCase()+" | "+v.toUpperCase()));
    }
}
