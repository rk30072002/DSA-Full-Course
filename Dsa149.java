imort java.util.Scanner;
class Dsa149{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int start=0;
        int ending=a.length-1;
        for(start=0;start<ending;start++){
            a[start]=sc.nextInt();
        }
        while(a[start]<a[ending]){
            int temp=a[start];
            a[start]=a[ending];
            a[ending]=temp;
            start++;
            ending--;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ")
        }
    }
}