class Solution {
    public String convert(String s, int numRows) {
        

       if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] str = new StringBuilder[numRows];

        for(int i =0; i<numRows; i++){
            str[i] = new StringBuilder();
        }
        int cr = 0;
        int d = 1;

        for(int i=0;i<s.length();i++){
            str[cr].append(s.charAt(i));
            if(cr==0){
                d=1;
            }else if(cr==numRows-1){
                d=-1;
            }
            cr = cr+d;
        }

        StringBuilder result  = new StringBuilder(); 

       for(int i =0; i<numRows; i++){
          
          result.append(str[i]);
        }
        return result.toString();

        


        

    }
}