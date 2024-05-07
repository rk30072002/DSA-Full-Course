class Dsa31Fact{
    public static void main(String args[]){
        int fact=1;
        int n=5;
        
        do{
            fact=fact*n;
            n--;
            System.out.println(fact);
        }
        while(n>0);
    }
}