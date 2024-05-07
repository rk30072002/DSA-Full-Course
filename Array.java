import java.util.Scanner;
class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<a.length;i++){//a.length==n
                    a[i]=sc.nextInt();
             //   System.out.print(a[i]);
            
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}