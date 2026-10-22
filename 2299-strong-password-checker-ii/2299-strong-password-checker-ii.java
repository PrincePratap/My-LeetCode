class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n = password.length();
        if(n<8){
            return false;
        }
        if(!password.matches(".*[a-z].*")){
            return false;
        }
         if(!password.matches(".*[A-Z].*")){
            return false;
        }
         if(!password.matches(".*[0-9].*")){
            return false;
        }
         if(!password.matches(".*[!@#$%^&*(){}\\-+].*")){
            return false;
        }
        char prevChar = password.charAt(0);

        for(int i = 1 ; i<n ; i++){
            char ch = password.charAt(i);
            if(prevChar==ch){
                return false;
            }
            prevChar=ch;
        }

        return true;

        
    }
}