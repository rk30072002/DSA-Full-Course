class Dsa135{
    public static void main(String args[]){
        int a[]={4,7,2,8,9,1,2};
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        int thirdMin=Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                thirdMin=secondMin;
                secondMin=min;
                min=a[i];
            }
            if(a[i]<secondMin && a[i]!=min){
                thirdMin=secondMin;
                secondMin=a[i];
            }
            if(a[i]<thirdMin && a[i]!=min && a[i]!=secondMin){
                thirdMin=a[i];
            }
        }
                System.out.println(thirdMin+" "+secondMin+" "+min);
    }
}