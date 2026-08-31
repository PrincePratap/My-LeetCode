class Solution {
    public void sortColors(int[] nums) {

        int i=0;
        int count0=0;
        int count1=0;
        int count2=0;

        for(int num : nums){
            if(num==0){
                count0++;
            }else if(num==1){
                count1++;
            }else if(num==2){
                count2++;
            }

        }
        while(count0>0){
            nums[i]=0;
            count0--;
            i++;
        }
         while(count1>0){
            nums[i]=1;
            count1--;
            i++;
        }
         while(count2>0){
            nums[i]=2;
            count2--;
            i++;
        }
        
    }
}