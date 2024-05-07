import java.util.Scanner;
class ArraySelection5{
    public static void PrintArraySelection(int a[]){
for(int i=0;i<a.length;i++){
    System.out.print(a[i]+" ");
}
System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        for(int i=0;i<a.length-1;i++){
            int smallest=i;
            for(int j=0;j<a.length;j++){
                if(a[j]<a[smallest]){
                    smallest=j;
                }  
            } 
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }
        
        PrintArraySelection(a);
        }
    
    
    
}