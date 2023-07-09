class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(tasks == null || tasks.length == 0) return 0;
        
        int[] count = new int[26];
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        for(char c:tasks) {
            count[c-'A']++;
            max = Math.max(max,count[c-'A']);
        }
        
        for(int c:count)
        {
            if(c==max) maxCount++;
        }
        
        int partitions = max - 1;
        int empty = partitions * (n-(maxCount-1));
        int remaining = tasks.length - (max*maxCount);
        
        int idle = Math.max(0,empty - remaining);
        
        return tasks.length + idle;
    }
}