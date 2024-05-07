import java.util.Scanner;
class Implementation_Stack{
    int top=-1;
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    
    void push(){
        if(top==(n-1)){
            System.out.print("Overflow");
        }
        else{
            System.out.print("enter the data:");
            int i=sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.print("item insert:");
        }
    }
    void pop(){
        if(top==-1){
            System.out.print("Underflow");
        }
        else{
            top=top-1;
            System.out.print("item delete:");
        }
    }
    void display(){
        System.out.print("item are");
        for(int j=top;j>=0;j--){
            System.out.print(a[j]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        
        Implementation_Stack s=new Implementation_Stack();
        // s.push();
        // s.pop();
        // s.display();
        boolean flag=true;
        while(flag){
            System.out.print("""
        press the 1 then push number:
        press the 2 then pop number:
        press the 3 then display number:
        press the 4 then exit:"""
        );
        int option=s.sc.nextInt();
        switch(option){
            case 1:
                int m=s.sc.nextInt();
                s.push();
                break;

            case 2:
                s.pop();
                break;

            case 3:
                s.display();

            case 4:
                System.out.print("Exiting...");
                return;

            default:
                System.out.print("Invalid button");
        }

    }
}
}