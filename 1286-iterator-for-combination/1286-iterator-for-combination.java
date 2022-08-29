class CombinationIterator {

    PriorityQueue<String> pq;
    public CombinationIterator(String characters, int combinationLength) {
        pq = new PriorityQueue<>();
        backtrack(characters,0,combinationLength, new StringBuilder());
        
    }
    
    private void backtrack(String s, int index, int count, StringBuilder result)
    {
        //base
        if(result.length() == count)
        {
            pq.add(result.toString());
            return;
        }
        //logic
        for(int i = index;i<s.length();i++)
        {
            result.append(s.charAt(i));
            backtrack(s,i+1,count,result);
            result.deleteCharAt(result.length()-1);
        }
    }
    
    public String next() {
        return pq.poll();
    }
    
    public boolean hasNext() {
        return pq.size()>0;
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */