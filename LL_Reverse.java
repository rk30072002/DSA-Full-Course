import java.util.*;
class LL_Reverse{
    Node head;
    private int size;
    LL_Reverse(){
        this.size=0;
    }

    class Node{
        int index;
        Node next;

        Node(int index){
            this.index=index;
            this.next=null;
            
        }
    }

    //add-first,last
    public void addFirst(int index){
        
        if(index>size || index<0){
            System.out.println("invailid index value");
            return;
        }
        size++;
        Node newNode=new Node(index);
        if(head==null || index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node currentNode=head;
        for(int i=1;i<size;i++){
            if(i==index){
                Node nextNode=currentNode.next;
                currentNode.next=newNode;
                newNode.next=nextNode;
                break;
            }
        
        
        
        currentNode= currentNode.next;
        }
    }
    public int getSize(){
        return size;
    }
    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currentNode=head.next;
        while(currentNode!=null){
            Node nextNode=currentNode.next;
            currentNode.next=prevNode;

            //update
            prevNode=currentNode;
            currentNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public static void main(String args[]){
    LL_Reverse list=new LL_Reverse();

LinkedList<Integer>list=new LinkedList<>();

    list.reverseIterate();
   // list.printList();
    }
}

