import java.util.Scanner;
class Dsa141{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
    //  int n=121;
        int r=0,t;
        while(n>0){
            t=n%10;
            r=r*10+t;
           n=n/10;

        }
        if(n==r)
           System.out.print("p");
        
       // else
        //     System.out.print("not pa");
        

    }
}