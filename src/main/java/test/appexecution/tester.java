package test.appexecution;



import java.util.*;

public class tester {
    public static void main(String args[]){
        int limit;
        Scanner in = new Scanner(System.in);
        limit = in.nextInt();
        ArrayList<myClassU> treeComparator = new ArrayList<myClassU>();
        HashMap<Integer,Integer> hashComparator = new HashMap<Integer, Integer>();
        Set<Integer> intSet = new TreeSet<Integer>();

        for(int i=0;i<limit;i++){
            int id,value;
            id = in.nextInt();
            value = in.nextInt();
            if(!intSet.contains(id)) {
                intSet.add(id);
                myClassU object1 = new myClassU(id, value);
                treeComparator.add(object1);
            }else{
                myClassU object1 = treeComparator.get(id-1);
                object1.value = (object1.value+value)/2;
            }
        }
        Collections.sort(treeComparator,new MyComparators());
        Iterator iter = treeComparator.iterator();
        int k=0;
        while(iter.hasNext()){
            myClassU obj = (myClassU)iter.next();
            System.out.println(obj.id+" | "+obj.value);
            k++;
            if(k>1){
                break;
            }
        }
    }
}

class myClassU {
    int id,value;
    myClassU(int id,int value){
        this.id = id;
        this.value = value;
    }

}

class MyComparators implements Comparator<myClassU>{
    @Override
    public int compare(myClassU t1, myClassU t2) {
        return t1.value == t2.value ? 0 : (t1.value > t2.value ? 1 : -1);
    }
}
