class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        Arrays.sort(potions);
        
        for(int i=0;i<spells.length;i++)
        {
            int left = 0;
            int right = potions.length - 1;
            
            while(left<=right)
            {
                int mid = left + (right - left) /2;
                long prod = (long) potions[mid] * spells[i];
                
                if(prod>=success) right = mid - 1;
                else left = mid + 1;
            }
            
            ans[i] = potions.length - left;
        }
        
        return ans;
    }
}