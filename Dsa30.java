class Dsa30{
    public static void main(String args[]){
        int n=5,r=3;
        int comb=1;
        int per=1;
       // for(int i=n;i=r;i>0;i--) {
           // per=n*i/r*i (n-r)*i;
            for(int i=n;i>=n-r+1;i--){

            
            per=per*i;
        }
            for(int i=r;i<=r;i++){
                comb=comb*i;

            }
            int t=per/comb;
            System.out.println(t);
    }
}