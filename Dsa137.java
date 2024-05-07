import java.util.Scanner;
class Dsa137{
    public static void main(String args[]){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int a[]=new int[n];
        // // for(int i=1;i<a.length;i++){
        // //     a[i]=sc.nextInt();

        // // }
        for(int i=n;i>0;i--){
fact=fact*i;
System.out.println(fact);
        }
    }
}