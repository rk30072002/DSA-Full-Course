import java.util.Scanner;
class Dsa124{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
           
        }
         float  avg=sum/n;
             System.out.print(avg);
       
    }
}