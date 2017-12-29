package test.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparables {
    public static void main(String args[]) {
        MyClass object1 = new MyClass(1, "mohan");
        MyClass object2 = new MyClass(2, "prasath");
        MyClass object3 = new MyClass(3, "test");

        //Comparable interface implemented in EqualMethod.java
        TreeSet<MyClass> tree = new TreeSet<MyClass>();
        tree.add(object1);
        tree.add(object3);
        tree.add(object2);

        tree.forEach(o -> System.out.println(o.toString()));

        TreeSet<MyClass> treeComparator = new TreeSet<MyClass>(new MyComparator());
        treeComparator.add(object2);
        treeComparator.add(object1);
        treeComparator.add(object3);

        treeComparator.forEach(o -> System.out.println(o.toString()));

    }
}

 final  class MyComparator implements Comparator<MyClass>{

    @Override
    public int compare(MyClass t1, MyClass t2) {
        return t1.key == t2.key ? 0 : (t1.key > t2.key ? 1 : -1);
    }
}
