class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}