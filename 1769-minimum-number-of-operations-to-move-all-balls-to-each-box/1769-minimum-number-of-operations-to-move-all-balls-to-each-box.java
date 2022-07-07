class Solution {
    public int[] minOperations(String boxes) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i =0;i<boxes.length();i++)
        {
            char curr = boxes.charAt(i);
            if(curr == '1')
            {
                set.add(i);
            }
        }
        
        int[] result = new int[boxes.length()];
        int i =0;
        
        while(i<boxes.length())
        {
            for(int j: set)
            {
                result[i]+= Math.abs(i-j);
            }
            i++;
        }
        
        return result;
    }
}