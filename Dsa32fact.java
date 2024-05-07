import java.util.Scanner;
class Dsa32fact{
    public static void main(String args[]){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
        fact=fact*i;
        System.out.println(fact);
    
}
    }
}