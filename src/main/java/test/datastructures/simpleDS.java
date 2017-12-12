package test.datastructures;

import java.util.Arrays;


public class simpleDS {
    int arr[] = new int[20];
    public simpleDS(int a[]){
        this.arr = Arrays.copyOf(a,a.length);
    }
    public void displayDS() {
        for (int i : this.arr) {
            System.out.println(this.arr[i]);

        }
    }
}
