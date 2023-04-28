class Solution {
    public int getMaxLen(int[] nums) {
        int pos = 0, neg = 0;
        int ans = 0;
        
        for(int x:nums)
        {
            if(x == 0)
            {
                pos = 0;
                neg = 0;
            }
            else if(x>0)
            {
                pos++;
                neg = neg == 0 ? 0 : neg + 1;
            }
            else{
                int temp = pos;
                if(neg == 0) pos = 0;
                else pos = neg + 1;
                neg = temp + 1;
            }
            
            ans = Math.max(pos,ans);
        }
        
        return ans;
    }
}