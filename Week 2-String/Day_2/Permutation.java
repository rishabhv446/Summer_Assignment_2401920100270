class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] count = new int[26];
        for (char ch : s1.toCharArray()) {
            count[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            count[s2.charAt(right) - 'a']--;

            if (right - left + 1 > s1.length()) {
                count[s2.charAt(left) - 'a']++;
                left++;
            }

            if (isZero(count)) {
                return true;
            }
        }

        return false;
    }
    private boolean isZero(int[] count) {

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }

        return true;
    }
}