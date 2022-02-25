class Solution {
    public int deleteAndEarn(int[] nums) {
        
        
        int min=0,max=0;
        
        int temp[] = new int[10001];
        for(int i:nums)
        {
            temp[i]++;
        
        
        if(i<min)
        {
            min = i;
        }
        else if(i>max)
        {
            max = i;
        }
        }
        
        
        int prev =0,next=0,ans =0;
        
        for(int i = min;i<=max;i++)
        {
            ans = Math.max(prev+i*temp[i],next);
            
            prev = next;
            next = ans;
        }
        
        return ans;
    }
}
