class Dsa129{
    public static void main(String args[]){
        int a[]={3,5,2,6,1,8,15};
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i;j<a.length;j++){
            if(a[min]<a[j]){
                min=j;
                

            }
        }
        int temp=a[min];
        a[min]=a[i];
        a[i]=temp;

        }
        for(int i:a){
        System.out.print(i+" ");
}

}
}