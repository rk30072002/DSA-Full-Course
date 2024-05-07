import java.util.Scanner;
// class Test{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter how many value in n : ");
//         int n=sc.nextInt();

//         char a[][]=new char[n][n];
//         String Board=".";

//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
        
//     }
// }
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
class LinkedList6{
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
                System.out.print("this is empty Node");
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

class Test{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter how many value :");
    LinkedList6 l6=new LinkedList6();

    boolean flag=true;
    while(flag){
        System.out.print("""
        press 1 to add node:
        press 2 to delete node:
        press 3 to display node:
        press 4 exit node:
        """);
        int option=sc.nextInt();
        switch(option){
            case 1:
                System.out.println("enter element:");
                int n=sc.nextInt();
                l6.add(n);
                break;
                case 2:
                    l6.delete();
                    break;
                case 3:
                    l6.display();
                    break;
                case 4:
                    flag=false;
                    break;

                default:
                    System.out.println("Invalid key");
        }

    }
    }
}