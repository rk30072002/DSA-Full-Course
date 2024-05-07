import java.util.Scanner;
class Dsa14{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=10 && n<=12||n==1){
            System.out.println("SUMMER");
    }
        else if(n>=2 && n<=5){
            System.out.println("SPRING");
        }
            else if(n>=6 && n<=9){
            System.out.println("RAINING");
        }
        else{
            System.out.println("NOTHING RETURN");
        }
    }
}