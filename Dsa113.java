class Dsa113{
    public static void main(String args[]){
        int a[]={4,6,1,2,3,7};
        
        for(int i=0;i<=a.length-1;i++){
            int c=0;
            for(int j=1;j<a[i];j++){
            if(a[i]%j==0){
                c=c+a[i];
                }
            }
            if(c==2){
                System.out.println("prime:"+a[i]);
            }
            else{
                System.out.println("not prime");
            }
        }
    }
}