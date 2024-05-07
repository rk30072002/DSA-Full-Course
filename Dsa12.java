import java.util.Scanner;
class Dsa12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n=='a' || n=='e'|| n=='i'| n=='o' || n=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonent");
        }
    }
}