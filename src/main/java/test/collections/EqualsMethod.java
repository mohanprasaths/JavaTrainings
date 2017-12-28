package test.collections;

import java.util.ArrayList;

public class EqualsMethod {
    public static void main(String args[]) {
        MyClass object1 = new MyClass(1, "mohan");
        MyClass object2 = new MyClass(2, "prasath");
        MyClass object3 = new MyClass(3, "test");

        ArrayList<MyClass> myList = new ArrayList<MyClass>();
        myList.add(object1);
        myList.add(object2);
        myList.add(object3);

        myList.remove(object3);
        for(MyClass o:myList){
            System.out.println(o.value);
        }
    }
}

class MyClass{
    int key; String value;
    public MyClass(int key,String value){
        this.key = key;
        this.value = value;
    }
    public boolean equals(Object o){
        MyClass ori = (MyClass) o;
        return value.equals(ori.value);
    }
}