class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        int start=0;
        int end=l1;
        int[] count1= new int[26];
        int[] count2= new int[26];
        for(int i=0;i<l1;i++)
        {
            count1[s1.charAt(i)-'a']++;
        }
        while(end<=l2){
            for(int i=start;i<end;i++)
            {
                count2[s2.charAt(i)-'a']++;
            }
        if (Arrays.equals(count1,count2)){
            return true;
        }
        start++;
        end++;
        count2=new int[26];
        }
        return false;
    }
}
