class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        
        for(int i = 1;i<nums.length;i++)
        {
            int num = nums[i];
            
            if(num>list.get(list.size()-1))
            {
                list.add(num);
            }
            else{
                int x = binarySearch(list,num);
                list.set(x,num);
            }
        }
        
        return list.size();
    }
    
    private int binarySearch(ArrayList<Integer> list, int target)
    {
        int low = 0, high = list.size()-1;
        
        while(low<high)
        {
            int mid = low + (high - low)/2;
            
            if(list.get(mid) == target) return mid;
            
            else if(list.get(mid)<target)
            {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        
        return low;
    }
}