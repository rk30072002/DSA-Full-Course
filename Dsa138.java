import java.util.*;
class Dsa138{
    public static void main(String args[]){
        int  gcd=1;
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();

//int min= Math.min(n1,n2);

//for(int i= min; i>=2; i--){
    for(int i=1; i<=n1 || i<=n2; i++){
    if(n1%i==0 && n2%i==0){
        gcd=i;
        // break;
       // gcd=gcd+i;
    }
}

    System.out.println(gcd);

    }
}