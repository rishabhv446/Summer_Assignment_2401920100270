class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
            for (int j = 0; j < s.length(); j++) {
                if(freq[s.charAt(j) - 'a'] == 1) return j;
            }        
        return -1;
    }
}