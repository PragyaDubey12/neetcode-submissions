class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        int left = 0;
        int maxLen = 0;

        int[] count = new int[65536];

        for (int right = 0; right < l; right++) {
            char ch = s.charAt(right);

            while (count[ch] > 0) {
                count[s.charAt(left)]--;
                left++;
            }

            count[ch]++;

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}