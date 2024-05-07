import java.util.Scanner;
class Dsa21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%3==0){
                sum=sum+i;
                System.out.println(sum);
            }
        }
    }
}