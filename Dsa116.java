import java.util.Scanner;
//import java.util.Arrays;
class Dsa116{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
       // Arrays.sort(a);

        for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
        }
            for(int i=0;i<a.length;i++){
                if(a[i]>max){
                    secondMax=max;
                    max=a[i];
                    
                }
                if(a[i]>secondMax && a[i]!=max){
                    secondMax=a[i];
                }
                
        
        }
        System.out.println(secondMax);
    }
}