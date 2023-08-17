class Solution {
    public int findMinFibonacciNumbers(int k) {
        
        ArrayList<Integer> list = new ArrayList<>();
        generate(k,list);
        
        int count = 0;
        int index = list.size()-1;
        
        
        while (k != 0) {
            while (list.get(index) > k) {
                index--; // Find the largest Fibonacci number less than or equal to k
            }
            k-=list.get(index);
            count++;
        }
        
        return count;
    }
    
    private void generate(int k, ArrayList<Integer> list)
    {
        list.add(0);
        list.add(1);
        int max = 1;
        
        while(max<=k)
        {
            list.add(list.get(list.size()-1)+list.get(list.size()-2));
            max = Math.max(max,list.get(list.size()-1));
        }
    }
}