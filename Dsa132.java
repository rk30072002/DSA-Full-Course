import java.util.Scanner;
class Dsa132{
    public static void main(String args[]){
        //int a[]={7,5,9,3,1,2};
        Scanner sc=new Scanner(System.in);
        int pos=3;
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n-1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<pos-1;i++){
            b[i]=a[i];
        }
    
        for(int i=pos-1;i<n-1;i++){
            b[i]=a[i+1];
        }
        
        for(int i=0;i<n-1;i++){
        System.out.println(b[i]);
        }
    }
}