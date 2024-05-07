class Dsa146{
    public static void printFibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        System.out.println(b);
        printFibonacci(b,a+b,n-1);
    }
    public static void main(String args[]){
        printFibonacci(0,1,5);
    }
    // public static void main(String args[]){
    //     int a=1,b=0,n=5;
    
    // }
}