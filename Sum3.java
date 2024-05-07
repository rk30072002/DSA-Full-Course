class Sum3{
    public static void main(String args[]){
        int a[]={-1,0,1,2,-1,-4};
        int sum;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    sum=a[i]+a[j]+a[k];
                    if(sum==0){
                        System.out.print("("+a[i]+","+a[j]+","+a[k]+")"+" ");
                    }
                }
            }
        }
    }
}