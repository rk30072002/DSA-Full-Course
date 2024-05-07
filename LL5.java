import java.util.Scanner;
class Node{
    int data;
    Node next;
    static Node head;
    static Node tail;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList3{
    public void add(int data){
        Node newNode=new Node(data);
        if(Node.head==null){
            Node.head=newNode;
            Node.tail=newNode;
        }
        else
        Node.tail.next=newNode;
        Node.tail=newNode;
    }
    public void delete(){
        if(Node.head==null){
            System.out.println("This is empty node");
        }
        else{
            Node.head=Node.head.next;
        }
    }

    public void display(){
        Node temp=Node.head;
        while(temp!=null){
            System.out.print("->"+temp.data);
            temp=temp.next;
        }
    }
}

    class LL5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many value n:");
        LinkedList3 l3=new LinkedList3();

        boolean flag= true;
        while(flag){

            System.out.println("""
            press 1 to add node:
            press 2 to delete node:
            press 3 to display:
            press 4 to exit:
            
        """);
        int option= sc.nextInt();

            switch(option){
                case 1:
                    System.out.print("Enter element: ");
                    int n= sc.nextInt();
                    l3.add(n);
                    break;
                case 2:
                    // System.out.print("enter any number:");
                    // int e=sc.nextInt();
                    l3.delete();
                    break;

                case 3:
                    l3.display();
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