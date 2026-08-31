class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }

        //set to array 
        int i = 0;
        int[] ans = new int[result.size()];

        for(int num : result){
            ans[i] = num;
            i++;
        }
        return ans;
    }
}