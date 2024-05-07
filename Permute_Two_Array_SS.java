import java.util.Scanner;
class Permute_Two_Array_SS{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter how many value user input do you want:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            System.out.print(a[i]+" "+b[i]);
        }

    }
}