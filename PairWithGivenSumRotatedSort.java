class PairWithGivenSumRotatedSort{
public static void main(String args[]){
    int a[]={11,15,6,8,9,10};
    int x=16;
    int sum;
    for(int i=0;i<a.length-1;i++){
        for(int j=i+1;j<a.length;j++){
            sum=a[i]+a[j];
            if(sum==x){
                System.out.print("true\n"+"("+a[i]+","+a[j]+")");
            }
            else{
                System.out.println("false") ;
            }
        }
    }
}
}