
class Solution {
    public List<String> commonChars(String[] words) {

        int n = words.length;
        List<String> result = new ArrayList<>();

        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];
            char[] str = words[i].toCharArray();

            for (int j = 0; j < str.length; j++) {
                freq[str[j] - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], freq[j]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }

        return result;
    }
}