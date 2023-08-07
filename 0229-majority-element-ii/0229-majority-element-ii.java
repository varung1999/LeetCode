class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        Integer candidate1 = null, candidate2 = null;
        int count1 = 0,count2 = 0;
        
        for(int i:nums)
        {
            if(candidate1!=null && i==candidate1) count1++;
            else if(candidate2!=null && i==candidate2) count2++;
            else if(count1==0)
            {
                candidate1 = i;
                count1++;
            }
            else if(count2==0)
            {
                candidate2 = i;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        
        for(int i:nums)
        {
            if(candidate1!=null && i == candidate1) count1++;
            if(candidate2!=null && i == candidate2) count2++;
            
        }
        int n = nums.length;
            
        if(count1>n/3) result.add(candidate1);
        if(count2>n/3) result.add(candidate2);
        
        return result;
        
    }
}