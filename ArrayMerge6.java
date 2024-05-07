import java.util.Scanner;
class ArrayMerge6{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("first");
    int n1=sc.nextInt();
    System.out.print("second");
    int n2=sc.nextInt();
    int n3=n1+n2;
    int a[]=new int[n1];
    int b[]=new int[n2];
    int c[]=new int[n3];
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();

    
    for(i=0;i<b.length;i++)
        b[i]=sc.nextInt();
    
    for( i=0;i<a.length;i++)
        c[i]=a[i];
        for(i=0;i<b.length;i++)
        c[n1+i]=b[i];
        for(i=0;i<c.length;i++)
        System.out.print(c[i]+" ");
    }

}
}