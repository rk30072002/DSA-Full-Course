//import java.util.Scanner;
class  Dsa23{
    public static void main(String args[]){
       // Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int n=123;
        int res=0,r;
        while(n>0){
            r=n%10;
            res=res*10+r;
            n=n/10;
            System.out.println(res);
        }
    }
}