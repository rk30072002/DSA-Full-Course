class sum{
    
    public static void printNum(int i,int n,int sum){
if(i==n){
    sum=sum+i;
    System.out.println(sum);
    return;
}
sum=sum+i;
printNum(i+1,n,sum);
    }
    public static void main(String args[]){
        printNum(1,5,0);
    }
}
