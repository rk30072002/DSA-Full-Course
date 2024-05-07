import java.util.Scanner;
class Dsa142{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,r;
        while(n>0){
            r=n%10;
            sum=(r*r*r)+sum;
            n=n/10;
        }
        if(n==sum){
        System.out.println("arm");
        
        }
    }
}