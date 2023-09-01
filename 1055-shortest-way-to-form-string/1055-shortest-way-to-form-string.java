class Solution {
    public int shortestWay(String source, String target) {
        
        int[] count = new int[26];
        for(char c:source.toCharArray()) {
            count[c-'a']++;
        }
        
        for(char c:target.toCharArray()){
            if(count[c-'a']==0) return -1;
        }
        
        int result = 1, sourceIndex = 0, targetIndex = 0;
        
        while(targetIndex<target.length())
        {
            if(sourceIndex >= source.length())
            {
                result++;
                sourceIndex = 0; 
            }
            if(source.charAt(sourceIndex)==target.charAt(targetIndex))
            {
                targetIndex++;
            }
            sourceIndex++;
        }
        
        return result;
    }
}