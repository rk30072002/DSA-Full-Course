class BitManipulation2{
    public static void main(String args[]){
        int n=5;//0101
        //set bit 
        int pos=1;
        int bitMask=1<<pos;
        int newBit=bitMask | n;
        System.out.print(newBit);
    }
}