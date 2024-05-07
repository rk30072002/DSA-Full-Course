class BitManipulation{
    public static void main(String args[]){
        int n=5;
        int pos=3;//get bit 0 and pos=2 get bit 4
        int Bitmask=1<<pos;
        int newBit=Bitmask & n;
        System.out.print(newBit);
    }
}