class Dsa29Per{
    public static void main(String args[]){
        int n=5;
        int r=3;
            int per=1;
      //  for(int i=n;i>0;i--){
     //   per=per*i/(n-r)*i;
        for(int i=n;i>=n-r+1;i--){
            per=per*i;
        }
System.out.println(per);
        
    }
}