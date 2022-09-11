class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        int n = nums.length;
        int[] count = new int[n+1];
        for(int i:nums)
        {
            count[i]++;
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(count[i]==2)
            {
                result.add(i);
            }
        }
        
        return result;
    }
}