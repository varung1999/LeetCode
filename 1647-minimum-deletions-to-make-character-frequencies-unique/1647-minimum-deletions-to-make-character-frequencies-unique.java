class Solution {
    public int minDeletions(String s) {
        if(s == null || s.length() == 0) return 0;
        //a - 1  b - 4   c - 1 e - 1
        
        int[] arr = new int[26];
        
        for(char c: s.toCharArray()){
            arr[c-'a']++;
        }
        
        HashSet<Integer> visited = new HashSet<>();
        
        int count = 0;
        for(int i : arr)
        {
            if(i!=0){
                 if(!visited.contains(i)) visited.add(i);
            else{
                while(visited.contains(i) && i>0)
                {
                    i--;
                    count++;
                }
                if(i>0) visited.add(i);
            }   
            }
        }
        return count;
    }
}