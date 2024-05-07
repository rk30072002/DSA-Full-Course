import java.util.Scanner;
class ArrayNameHeight{
    public static void main(String args[]){
        int max=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String name[]=new String[n];
        int height[]=new int[n];
        for(int i=0;i<height.length;i++){
        height[i]=sc.nextInt();
        }
        for(int i=0;i<name.length;i++){
            name[i]=sc.next();
        }

    for(int i=0;i<n;i++){
        if(height[i]>max){
            max=height[i];
        }
    
    }
        System.out.println("Max height: " + max);
        System.out.println("People with max height:");
        for (int i = 0; i < n; i++) {
            if (height[i] == max) {
                System.out.println(max + " " + name[i]);
            }
        }
    }
}