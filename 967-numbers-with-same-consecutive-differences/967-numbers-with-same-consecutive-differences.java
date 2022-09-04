class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        
        while(!q.isEmpty())
        {
            int currNum = q.poll();
            int lastDig = currNum%10;
            int totalSize = String.valueOf(currNum).length();
            
            if(totalSize == n)
            {
                set.add(currNum);
                continue;
            }
            
            int plus = lastDig + k;
            int minus = lastDig - k;
            
            if(plus>=0 && plus<=9){
                q.add((currNum*10) + plus);
            }
            
            if(minus>=0 && minus<=9)
            {
                q.add((currNum*10) + minus);
            }
        }
        
        int index = 0;
        int[] result = new int[set.size()]; 
        
        for(int i:set)
        {
            result[index] = i;
            index++;
        }
        
        return result;
    }
}