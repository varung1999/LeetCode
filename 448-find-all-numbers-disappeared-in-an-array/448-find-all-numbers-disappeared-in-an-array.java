class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        int[] temp = new int[n+1];
        for(int i:nums)
        {
            temp[i]++;
        }
        
        for(int i = 1;i<temp.length;i++)
        {
            if(temp[i]==0)
            {
                result.add(i);
            }
        }
        
        return result;
    }
}