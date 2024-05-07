import java.util.Scanner;

class Node2{
    int data;
    Node2 left, right;
    public Node2(int x){
        this.data= x;
        left= null;
        right= null;
    }
}

class Bin_Tree{
    public static Node2 createTree(){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter Node2: ");
        int data= scan.nextInt();

        if(data== -1){
            return null;
        }else{
            Node2 root= new Node2(data);
            System.out.println("Enter left value for root "+data);
            root.left= createTree();

            System.out.println("Enter right value for root "+ data);
            root.right= createTree();

            return root;
        }
    }

    public static void inOrder(Node2 root){
        if(root == null){
            return;
        }else{
            inOrder(root.left);
            System.out.print(" -> "+ root.data);
            inOrder(root.right);
        }

    }
    public static void main(String args[]){
        Node2 root = createTree();
        System.out.println();
        inOrder(root);
    }
}