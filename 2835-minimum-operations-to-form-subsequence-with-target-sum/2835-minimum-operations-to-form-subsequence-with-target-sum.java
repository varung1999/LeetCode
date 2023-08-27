class Solution {
    public int minOperations(List<Integer> nums, int target) {
        if(nums == null || nums.size() == 0) return -1;
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b - a);
        for(int num:nums){
            sum+=num;
            pq.add(num);
        }
        
        if(sum<target) return -1;
        else if(sum == target) return 0;
        long count = 0;
        while(!pq.isEmpty())
        {
            int curr = pq.poll();
            sum-=(long)curr;
            
            if(curr<=target) target-=curr;
            
            if(curr>target && sum<target)
            {
                count++;
                pq.add(curr/2);
                pq.add(curr/2);
                sum+=(long)curr;
            }
        }
        
        return (int)count;
    }
}