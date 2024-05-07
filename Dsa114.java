import java.util.Scanner;
class Dsa114{
    public static void main(String args[]){
      //  int a[]={2,4,74,9};
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
           // for(int j=i+1;j<a.length;j++){
                if(a[i]>max){
                    max=a[i];
                    
                }
            }
            System.out.println(max);
        }
    }
//}