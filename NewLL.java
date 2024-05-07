import java.util.Scanner;

class Node{
    int data;
    Node next;
    static Node head;
    static Node tail;

    public Node(int x){
        data= x;
        next= null;
    }
}

class LinkedList1{
    public int addNode(int x){
        Node newNode= new Node(x);

        if(Node.head==null){
            Node.head= newNode;
            Node.tail= newNode;
            return 1;
        }
        else{
            Node.tail.next= newNode;
            Node.tail= newNode;
            return 1;
        }
    }

    public void deleteNode(){
        if(Node.head== null){
            System.out.println("Empty linked list");
        }
        else{
            Node.head= Node.head.next;
        }
    }

    // public int updateNode(){
    //     return 0;
    // }

    public void display(){
        Node temp= Node.head;
        while(temp!=null){
            System.out.print(" -> "+ temp.data);
            temp= temp.next;
        }
        System.out.println();
    }
}


class NewLL{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        LinkedList1 l1= new LinkedList1();

        boolean flag= true;
        while(flag){

            System.out.println("""
            press 1 to add node:
            press 2 to delete node:
            press 3 to display:
            press 4 to exit:
            
        """);
        int option= scan.nextInt();

            switch(option){
                case 1:
                    System.out.print("Enter element: ");
                    int e= scan.nextInt();
                    l1.addNode(e);
                    break;
                case 2:
                    l1.deleteNode();
                    break;

                case 3:
                    l1.display();
                    break;
                
                case 4:
                    flag= false;
                    break;

                default:
                    System.out.println("Invalid key");
            }
        }
    }
}