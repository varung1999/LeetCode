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
                int j = 0;
                while(num>list.get(j))
                {
                    j++;
                }
                list.set(j,num);
            }
        }
        
        return list.size();
    }
}