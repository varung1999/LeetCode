//using TreeMap
//Time Complexity: O(n)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i =0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        int count = 0;
        for(Map.Entry it: map.entrySet())
        {
            count+=(int)it.getValue();
            
            if(count>nums.length-k)
            {
                return (int)it.getKey();
            }
        }
        return -1;
        
    }
}



//using Priority Queue
//Time Complexity: O(n log n) since adding an element in priority queue takes O(log n)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i : nums)
        {
            queue.add(i);
            if(queue.size()>k)
            {
                queue.remove();
            }
        }
        return queue.remove();
        
    }
}
