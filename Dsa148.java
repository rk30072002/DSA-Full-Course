class Dsa148{
    public static void main(String args[]){
        System.out.println("ASCII Table:");
        System.out.println("--------------");

        for(int i=0;i<=127;i++){
            System.out.println( i+" :"+(char) i);
            // if(i<0 || i==127){
            //     System.out.println("non printable or control character");

            // }else{
            //     System.out.println((char) i);
            // }
        }
    }
}