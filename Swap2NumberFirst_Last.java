class Swap2NumberFirst_Last{
//     public static void main(String args[]){
    
// int num=123456;
// int r=0,t,n=100000,count=0;

// // while(num>0){
// // n=num%10;
// // r=r*10+n;
// // num=num/10;
// // count++;
// // if(count==2){

// // }
// // System.out.println(r);
// // }
// t=num%10;
// r=t*n;
// num=num/10;
// count++;
// System.out.println(count);
//     }
public static void main(String[] args) {
        int inputNumber = 123456;
        int outputNumber = 0;

    
        outputNumber += inputNumber % 10 * 100000;
        inputNumber /= 10;
        outputNumber += inputNumber % 10 * 10000;
        inputNumber /= 10;
        outputNumber += inputNumber % 10 * 100;
        inputNumber /= 10;
        outputNumber += inputNumber % 10 * 1000;
        inputNumber /= 10;
        outputNumber += inputNumber % 10 * 10;
        inputNumber /= 10;
        outputNumber += inputNumber % 10;

        System.out.println("Input number: " + inputNumber);
        System.out.println("Output number: " + outputNumber);
    }
}


