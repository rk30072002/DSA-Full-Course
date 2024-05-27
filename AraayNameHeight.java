import java.util.Scanner;
class AraayNameHeight{
    public static void main(String args[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n=sc.nextInt();

        String name[]=new String[n];
        int height[]=new int[n];

        System.out.println("Enter the heights of the people:");
        for(int i=0;i<height.length;i++){
        height[i]=sc.nextInt();
        }

        System.out.println("Enter the names of the people:");
        for(int i=0;i<name.length;i++){
            name[i]=sc.next();
        }

    for(int i=0;i<n;i++){
        if(height[i]>max){
            max=height[i];
        }
        if (height[i] < min) {
                min = height[i];
            }
    
    }
        System.out.println("Max height: " + max);
        System.out.println("People with max height:");
        for (int i = 0; i < n; i++) {
            if (height[i] == max) {
                System.out.println(name[i]);
            }
        }

        System.out.println("Min height: " + min);
        System.out.println("People with min height:");
        for (int i = 0; i < n; i++) {
            if (height[i] == min) {
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}