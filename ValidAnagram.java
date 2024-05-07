class ValidAnagram{
    public static void main(String args[]){
        String s="anagram";
        String t="nagaram";
        
        if(s.length()!=t.length()){
            System.out.print("false");
        }
        else{
            int count[]=new int[26];
        for(int i=0;i<s.length();i++){
          //  char s1=s.charAt(i);
          //  char t1=t.charAt(i);

            //s1++;
           // t1--;
            count[s.charAt(i)-'a']++;
            
            

        }
    //boolean isAnagram=true;
        for(int i=0;i<s.length();i++){
            count[t.charAt(i)-'a']--;
        }
        boolean isAnagram=true;
        for(int i=0;i<count.length;i++){

        
            if(count[i]!=0){
                isAnagram=false;
                break;
            
            }
        }
        if(isAnagram){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
        }
    }
}