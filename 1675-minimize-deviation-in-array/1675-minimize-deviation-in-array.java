class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set  = new TreeSet<>();
        
        for(int i: nums)
        {
            if(i%2==0)
            {
                set.add(i);
            }
            else
            {
                set.add(i*2);
            }
        }
        
        int difference = set.last() - set.first();//18 
        int temp =0;
        
        while(set.size()> 0 && set.last()%2==0)
        {
            temp = set.last();
            set.remove(temp);
            set.add(temp/2);
            
            difference = Math.min(difference, set.last() - set.first());
        }
        
        return difference;
        
        
    }
}