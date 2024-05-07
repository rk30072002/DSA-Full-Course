class MergeArrayPalindrome{
    public static void main(String args[]){
        int a[]={11,14,15,99};
        int count=0;
        int i=0;
        int j=a.length-1;
        while(i<j){
        if(a[i]==a[j]){
            i++;
            j--;
        }
        else if(a[i]>a[j]){
            j--;
            a[j]+=a[j+1];
            count++;
        }
        else{
            i++;
            a[i]+=a[i-1];
            count++;
        }
        System.out.println(count);
        }
    }
}