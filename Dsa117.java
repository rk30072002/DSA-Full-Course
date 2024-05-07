import java.util.Scanner;
class Dsa117{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++){
    a[i]=sc.nextInt();

}
int num=sc.nextInt();
int sum=0;
for(int i=0;i<n;i++){
    if(a[i]==num){
        sum++;
    }
}
System.out.println("the number is"+num+"is"+sum);
//Scanner.close();
    }
}