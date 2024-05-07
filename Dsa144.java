class Dsa144{
    public static void main(String args[]){
        int n=143;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=r*r*r+sum;
            n=n/10;
            System.out.println(sum);
        }
    }
}