import java.util.Scanner;
class SwapTwoNumber{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
    int m=0;
        int x=n;
        int n1=n,n2=n,x1,x2,x3,x4;
        while (x>0) {
            x=x/10;
            m++;
        }
        if(m<6){
            System.out.println("error: please enter a number with at least 4 digits");
        }
        else{
            x1=n1%10;
            n1=n1/10;
            x2=n1%10;
            x3=n2/(int)Math.pow(10,m-1);
            x4=n2/(int)Math.pow(10,m-2);
            x4=x4%10;
            n2=n2%(int)Math.pow(10,m-2);
            n2=n2/100;
            int sum=x1*(int)Math.pow(10,m-1)+x2*(int)Math.pow(10,m-2)+n2*100+x4*10+x3;
            System.out.println(sum);
            sc.close();
      }
    }
}

