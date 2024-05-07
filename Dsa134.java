import java.util.Scanner;
class Dsa134{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int up=5;
        int pos=3;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
        
                a[pos-1]=up;
                System.out.print(a[i]);
        
            
        }
    }
}