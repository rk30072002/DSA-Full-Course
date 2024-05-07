import java.util.ArrayList;
import java.util.Collections;
class ArrayList2{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(19);
        System.out.println(list);
    int element=list.get(5);
    System.out.println(element);
    
    list.add(1,3);
    System.out.print(list);


    list.set(0,6);
    System.out.println(list);

    list.remove(0);
    System.out.println(list);

    int size=list.size();
    System.out.println(size);

    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }
        //list.add(0);
        Collections.sort(list);
        System.out.println(list);
    
    }
}