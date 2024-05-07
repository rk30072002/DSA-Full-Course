class SubArraySumAllCombination{
    public static void main(String args[]){
int a[]={1,2,3,4};
//int r=2;
for(int i=0;i<a.length-1;i++){
    for(int j=1;j<a.length;j++){
        if(a[i]!=a[j]){
        System.out.println(a[i]+" "+a[j]);
        }
    }
}
}
}