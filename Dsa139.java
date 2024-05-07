class Dsa139{
    public static void main(String args[]){
        int n1=2;
        int n2=5;
        int n3=8;
        int gcd=1;
       // int lcm=1;
       int m= Math.min(n1, Math.min(n2, n3));
        for(int i=1;i<=m;i++){
            if(n1%i==0&&  n2%i==0&&   n3%i==0){
                gcd*=i;
                n1/=i;
                n2/=i;
                n3/=i;
               
            }
        }
             System.out.println(gcd);
        
             int lcm=n1*n2*n3;
            System.out.println(lcm);
            
            
        
        }
        
    }
