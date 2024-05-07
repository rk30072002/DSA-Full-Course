class BitManipulation4{
    public static void main(String args[]){
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int newBit=~(bitMask);
        int newNumber=newBit | n;
        System.out.print(newNumber);
    }
}