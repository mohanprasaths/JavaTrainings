package test.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddCollection {
    public static void main(String args[]){
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("hello");
        arrayList1.add("there");

        LinkedList<String> linkedList1 = new LinkedList<String>();
        linkedList1.add("Welcome");
        linkedList1.add("!!!");

        arrayList1.addAll(linkedList1);

        for(String o:arrayList1){
            System.out.println(o);
        }
    }
}

