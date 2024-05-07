class Dsa92{
    public static void main(String args[]){
        int n=5;
        char C='A';
        for(int i=0;i<n;i++){
            C+=i;
            for(int j=0;j<i+1;j++){
                System.out.print(C);
                    C--;
                    
            }
            C= 'A';
            for(int k=1;k<i+1;k++){
                C+= k;
                System.out.print(C);
                
                
                
                
            }
            System.out.println();
            C='A';
            
            
           // C++;
        }
    }
}