//import java.util.Scanner;
class Stack{

    //     static void push(int value){
            
    //         if(top<a.length){
    //             a[++top]=value;
    //         }
    //         else{
    //             System.out.print("over follow");
    //         }
    //         static int pop(){
    //             if(top>-1){
    //                 return a[top--]=0;
    //             }
    //             else{
    //                 return -1;
    //             }
    //         }
    //         static void show(){
    //             for(int i=0;i<n;i++){
    //             System.out.println(a[i]);
    //             }
    //         }
    //     public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int top=-1;
    //     int a[]=new int[n];
    //     for(int i=0;i<a.length;i++){
    //         System.out.println(a[i]);
    //     }
    //     }
    // }

    
    static int top=-1;
    static int arr[]=new int[5];
    static void push(int value){
        if(top<arr.length){
            arr[++top]=value;
        }else {
            System.out.println("Stack overfulo");
        }
    }
    static int pop(){
        if(top>-1){
            return arr[top--]=0;

        }else {
            return -1;
        }
    }
static void show()
{
    for(int i=0; i< arr.length; i++)
    {
        System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
       push(15);
       push(20);
       push(25);
       push(30);
       push(35);
     //  push(40);
       for (int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
        System.out.println();
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println();
        push(45);
        push(50);
        push(89);
        push(80);
        push(90);
        System.out.println();
        show();

    }
}

