class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures == null || temperatures.length == 0) return new int[]{};
        
        int n = temperatures.length;
        int[] result = new int[n];
        
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        int i = 1;
        int k = 0;
        while(i<temperatures.length)
        {
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i])
            {
                int temp = stack.pop();
                result[temp] = i - temp;
                
            }
            stack.push(i);
            i++;
        }
        
        return result;
    }
}