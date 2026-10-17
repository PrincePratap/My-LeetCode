class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();

        if(n==1){
            return 1;
        }


        for(int i= 0 ; i<n; i++){
            for(int j=i; j<n;j++){
                if(isPalindromic(s,i,j)){
                    count++;
                }
            }
        }

        return count;

        
    }
    boolean isPalindromic(String s , int left , int right){

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}