class BitManipulation3{
    public static void main(String args[]){
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        //clearBit
        int newBit=~(bitMask);
        int newNumber=newBit & n;
        System.out.print(newNumber);

    }
}