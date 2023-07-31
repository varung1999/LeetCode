class Solution {
    int max = 1;
    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int n = nums.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i]>list.get(list.size()-1)) list.add(nums[i]);
            else{
                int index = binarySearch(list,nums[i]);
                if(index!=-1) list.set(index,nums[i]);
            }
        }
        
        return list.size();
    }
    
    private int binarySearch(ArrayList<Integer> list, int target)
    {
        int low = 0, high = list.size()-1;
        
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            
            if(list.get(mid) == target) return -1;
            else if(list.get(mid)<target) low = mid+1;
            else high = mid - 1;
        }
        
        return low;
    }
}