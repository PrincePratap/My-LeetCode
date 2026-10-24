class Solution {
    public int distributeCandies(int[] candyType) {

        int n = candyType.length/2;
        HashSet<Integer> set = new HashSet<>();
        for(int candy : candyType){
            set.add(candy);
        }

        return Math.min(n,set.size());
        
        
    }
}