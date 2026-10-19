class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int left=0;
        int right=n-1;
        char[] arr = s.toCharArray();

        while(left<right){
            while(left<right && !isVowels(arr[left])){
                left++;
            }
            while(left<right && !isVowels(arr[right])){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;

            left++;
            right--;
        }
        return new String(arr);

    }
   public boolean isVowels(char ch){

        if( ch == 'a' || ch == 'A' || 
            ch == 'e' || ch == 'E' ||
            ch == 'i' || ch == 'I' ||
            ch == 'o' || ch == 'O'  ||
            ch == 'u' || ch == 'U' ){
                return true;
            }
            return false;

    }
}