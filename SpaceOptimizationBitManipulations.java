class SpaceOptimizationBitManipulations{
    public static void main(String args[]){
        int arr[]={2,10};
        int a=2;
        int b=10;
        for(int i=2;i<=b;i++){
            if(i%2==0 || i%5==0){
                System.out.print("1"+" ");
            }
            else{
                System.out.print("0"+" ");
            }
        }
    }
}