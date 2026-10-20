class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(n==1){
            return 1;
        }
        int count = 1;
        int write = 0;
        for(int i=1;i<n;i++){
            char prevChar = chars[i-1];
            char currentChar = chars[i];
            if(prevChar==currentChar){
                count++;
            }else{
                 chars[write++] = prevChar;
                if(count>1){
                    for(char digits : String.valueOf(count).toCharArray()){
                        chars[write++] = digits;
                    }
                }
                count=1;             
            }
        }
        chars[write++] = chars[n-1];
        if(count>1){
            for(char digits : String.valueOf(count).toCharArray()){
                    chars[write++] = digits;
                }
        }
        return write;
    }
}