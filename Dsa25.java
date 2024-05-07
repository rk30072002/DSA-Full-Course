class Dsa25{
    public static void main(String args[]){
        int sum=0;
        int number=453628;
        int position=1;
        while(number>0){
            
        
        int digit=number%10;
        
            if(position%2==0){
                
                sum=sum+digit;
            
            }
            number=number/10;
            position++;
            
        }
        System.out.println(sum);
    
    }
}