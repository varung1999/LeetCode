class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        if(nums == null || nums.length == 0) return "";
        
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(String a, String b)
            {
                return a.length() == b.length() ? a.compareTo(b) : Integer.compare(a.length(),b.length());
            }
        });
        
        for(String num:nums)
        {
            pq.add(num);
            if(pq.size()>k) pq.poll();
        }
        
        return pq.peek();
    }
}