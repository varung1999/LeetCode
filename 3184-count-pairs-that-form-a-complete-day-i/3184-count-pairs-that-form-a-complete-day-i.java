class Solution {
    public int countCompleteDayPairs(int[] hours) {
        if(hours == null || hours.length == 0) return 0;
        
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int hour: hours)
        {
            int rem = hour%24;
            
            if(rem == 0){
                count+= map.getOrDefault(0,0);
            }
            else{
                count+= map.getOrDefault(24-rem,0);
            }
            
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        
        return count;
    }
}