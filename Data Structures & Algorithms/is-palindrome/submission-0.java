class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            //spaces and punc from left
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            //spaces and punc from right
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            //palindrome check
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}