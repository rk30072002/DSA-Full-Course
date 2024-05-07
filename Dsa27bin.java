class Dsa27bin{
    public static void main(String args[]){
        int n=100;
        String str="";

        while(n>0){
    
            int r=n%2;
            str=str+r;
            n=n/2;
        }
        System.out.println(str);
    }
}