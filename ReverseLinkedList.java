// import java.util.Scanner;
// class Node{
//     int data;
//     Node next;
    
//     static Node head;
//     static Node tail;
//     public Node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }
// class LinkedList7{
// public void add(int data){
//     Node newNode=new Node(data);
//     if(Node.head==null){
//         Node.head=newNode;
//         Node.tail=newNode;
//     }
//     else
//     Node.tail.next=newNode;
//     Node.tail=newNode;
// }
// public void display(){
//     Node temp=Node.head;
//     while(temp!=null){
//         System.out.print("->"+temp.data);
//         temp=temp.next;
//     }

// }


// public void reverse(Node head){
//     // if(head==null || head.next==null){
//     //     return head;
//     // }
//     // Node newHead=reverse(head.next);
//     // head.next.next=head;
//     // head.next=null;
    
//     // return newHead;
//     if(head==null || head.next==null){
//         return;
//     }
// //currentNode=nextNode=head;
// Node PrevNode=null;
// Node currentNode=Node.head;

// while(currentNode!=null){
// Node nextNode=currentNode.next;
// currentNode.next=PrevNode;
// //update
// PrevNode=currentNode;
// currentNode=nextNode;
// }
// head.next=null;
// head=PrevNode;

// Node.tail=Node.head;
// }
// }
// class ReverseLinkedList{
//     public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// LinkedList7 l7=new LinkedList7();
// boolean flag=true;
// while(flag){
//     System.out.print("""
//     press 1 add list:
//     press 2 display the list:
//     press 3 reverse the list:
//     """);

//     int option=sc.nextInt();
//     switch(option){
//             case 1:
//                 int n=sc.nextInt();
//                 l7.add(n);
//                 break;

//             case 2:
                
//                 l7.display();
//                 break;

//             case 3:
            
//                 l7.reverse();
//                 break;
                
//             case 4:
//                 flag=false;
//                 break;

//             default :
//             System.out.print("Invalid key");
//     }
//     }
// }
// }






import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node head;
    Node prev;
    Node(int data) {
        this.data = data;
        this.next=null;
    }
}

public class ReverseLinkedList {
    public static Node reverseList(Node head) {
        Node prev = null;
        Node currentNode = head;

        while (currentNode != null) {
            Node nextTemp = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextTemp;
        }
        
        return prev; // prev now points to the new head of the reversed list
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the linked list
        System.out.print("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the linked list:");
        Node dummy = new Node(0);
        Node current = dummy;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            current.next = new Node(data);
            current = current.next;
        }

        // Remove the dummy node and get the actual head of the linked list
        Node head = dummy.next;

        // Reverse the linked list
        Node reversedListHead = reverseList(head);

        // Print the reversed linked list
        System.out.println("Reversed linked list:");
        while (reversedListHead != null) {
            System.out.print("->"+reversedListHead.data);
            reversedListHead = reversedListHead.next;
        }

        sc.close();
    }
}

