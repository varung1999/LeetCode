import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int numbers:nums)
        {
            set.add(numbers);
        }
        
        if(set.size()<n)
        {
            return true;
        }
        return false;
        
    }
}
