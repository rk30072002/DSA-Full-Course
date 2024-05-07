class Valid_Palindrome{
public static void main(String args[]){
    String s="A man, a plan, a canal: panama";
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char leftChar=s.charAt(left);
            char rightChar=s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rightChar)){
                right--;
            }
            else{
                if(Character.toLowerCase(leftChar)!=Character.
                toLowerCase(rightChar)){
                   // return false;
               // System.out.print("false");
        //Boolean isBoolean=false;
                }
                left++;
                right--;
            }
        }
        //Boolean isBoolean=true;
//return true;
//System.out.print("true");
}
}