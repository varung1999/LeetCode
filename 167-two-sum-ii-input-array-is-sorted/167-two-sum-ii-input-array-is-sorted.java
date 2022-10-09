class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length == 0) return new int[]{};
        
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i =0;i<numbers.length;i++)
        {
            int curr = numbers[i];
            if(map.containsKey(target - curr) && map.get(target - curr) < i+1)
            {
                ans[0] = map.get(target - curr);
                ans[1]= i+1;
            }
            else{
                map.put(curr,i+1);
            }
        }
        
        return ans;
    }
}