class Dsa131{
    public static void main(String args[]){
        int a[]={5,3,7,8,4,9,2};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                thirdMax=secondMax;
                secondMax=max;
                max=a[i];
            }
            if(a[i]>secondMax && a[i]!=max){
                thirdMax=secondMax;
                secondMax=a[i];
            }
            if(a[i]>thirdMax && a[i]!=secondMax && a[i]!=max){
                thirdMax=a[i];
            }
        }
        System.out.println(max+" "+secondMax+" "+thirdMax);
    }
}