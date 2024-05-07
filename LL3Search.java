import java.util.*;
class LL3Search{

    public static void main(String args[]){
        LinkedList<Integer>list=new LinkedList<Integer>();
        
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(7);
        list.addFirst(3);
        list.addFirst(1);
        
        System.out.println(list);
        list.find(i,7);
        System.out.println(list);
    }
}