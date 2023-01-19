class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        boolean[] present = new boolean[nums.length+1];
        for(int num:nums)
        {
            present[num] = true;
        }
        
        for(int i = 1;i<present.length;i++)
        {
            if(!present[i]) result.add(i);
        }
        return result;
    }
}