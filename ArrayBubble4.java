import java.util.Scanner;
class ArrayBubble4{
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            }

            
                for( int i=0;i<a.length-1;i++){
                    for(int j=0;j<a.length-i-1;j++){
                    
                    if(a[j]>a[j+1]){
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    
                    }
                    
                 }
            //         for( i=0;i<a.length;i++)
            //         System.out.print(a[i]);
                
                 }
                 printArray(a);
        
                }
    }
        
    
