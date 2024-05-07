class Fibonacci{
    public static void PrintFibonacci(int a,int b ,int n){
        
if(n==0){
    
    return;
}
        
System.out.println(a);
PrintFibonacci(b,a+b,n-1);

    }
    public static void main(String args[]){
        // int a=0;
        // int b=1;
        // int n=7; two number are printed  a=0 and b=1 so that take n-2 =5
        // PrintFibonacci(a,b,n-2);


PrintFibonacci(0,1,5);
    }
}