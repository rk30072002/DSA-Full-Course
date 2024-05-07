import java.util.Scanner;
class Dsa133{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int a[]={1,2,3,9,4};
        int pos=3;
        int insert=6;
        int a[]=new int[n];
        int b[]=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
           // int insert=sc.nextInt();
        }
    
        for(int i=0;i<pos-1;i++){
            b[i]=a[i];
            
        }
        b[pos-1]=insert;
        for(int i=pos;i<n+1;i++){
            b[i]=a[i-1];
            
        }
        n++;
       // a[a.length]++;
        for(int i=0;i<n+1;i++){
        System.out.println(b[i]);
        }
    }
}