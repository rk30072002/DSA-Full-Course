import java.util.*;


public class Array3{
   public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
    if(a[i]<min){
        min=a[i];
       
    }
    if(a[i]>max){
        max=a[i];
    }
}
System.out.println(max);
System.out.println(min);
      
   }
}
