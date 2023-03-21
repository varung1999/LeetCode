class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids == null || asteroids.length <=1) return asteroids;
        
        Stack<Integer> stack = new Stack<>();
        
        boolean blows = false;
        
        for(int num: asteroids)
        {
            blows = false;
            
            while(!stack.isEmpty() && num<0 && stack.peek() > 0 && !blows)
            {
                if(-num<stack.peek()) blows = true;
                else{
                    if(-num == stack.peek())
                    {
                        blows = true;
                        stack.pop();
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(!blows){
                    stack.push(num);
                }
        }
        
        int[] result = new int[stack.size()];
        
        for(int i = result.length - 1;i>=0;i--)
        {
            result[i] = stack.pop();
        }
        
        return result;
        
    }
}