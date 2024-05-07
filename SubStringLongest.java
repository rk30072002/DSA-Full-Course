class SubStringLongest{
    public static void main(String args[]){
        String s="abcabcbb";
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
               // if(s(i)!=s(j)){
            count++;
                
                System.out.print(count);
               // }
                }
            }
        }
    }
