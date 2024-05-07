import java.util.Scanner;
class Node{
    int data;
    Node Next;
    static Node head;
    static Node tail;
    public Node(int x){
        data=x;
        Next=null;
    }
}
class LinkedList2{
    public void add(int x){
        Node newNode=new Node(x);
        if(Node.head==null){
            Node.head=newNode;
            Node.tail=newNode;

        }
        else{
            Node.tail.Next=newNode;
            Node.tail=newNode;
        }
    }
    public void display(){
        Node temp=Node.head;
        while(temp!=null){
        
            System.out.print(" -> "+ temp.data);
            temp=temp.Next;
        }
        System.out.println();
    }

}

class NewLL4{


        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

        
            LinkedList2 l1=new LinkedList2();
            boolean flag=true;
            while(flag){
            System.out.print("""
            press 1 to add Node:
            press 2 to display:
            """);
            
            int option=sc.nextInt();
            if(option==1){
                System.out.print("enter any number");
            int e=sc.nextInt();
            l1.add(e);
            
            }
            else if(option==2){
                
            l1.display();
            
            }
            else if(flag=false){
                System.out.print("false");
            }
            else{
                System.out.print("invalid num");
            }
        
        }
    }
}