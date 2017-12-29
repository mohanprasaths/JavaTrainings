package test.collections;

import java.util.ArrayList;

public class LamdaExpression {
    public static void main(String args[]){
        MyClass object1 = new MyClass(1, "mohan");
        MyClass object2 = new MyClass(2, "prasath");
        MyClass object3 = new MyClass(3, "test");

        ArrayList<MyClass> myList = new ArrayList<MyClass>();
        myList.add(object1);
        myList.add(object2);
        myList.add(object3);

        myList.forEach(o -> System.out.println(o.getLabel()));
        myList.removeIf(o -> o.getLabel().equals("mohan"));
        myList.forEach(o -> System.out.println(o.getLabel()));
    }
}

