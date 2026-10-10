class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxlen=0;
        int maxfreq=0;
        int[] count=new int[26];
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            count[ch-'A']++;
            maxfreq=Math.max(maxfreq,count[ch-'A']);
            int winlen=right-left+1;
            if(winlen-maxfreq>k)
            {
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
