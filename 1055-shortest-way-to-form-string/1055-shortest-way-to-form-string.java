class Solution {
    public int shortestWay(String source, String target) {
        
//         int[] count = new int[26];
//         for(char c:source.toCharArray()) {
//             count[c-'a']++;
//         }
        
//         for(char c:target.toCharArray()){
//             if(count[c-'a']==0) return -1;
//         }
        
        int result = 0, targetIndex = 0;
        
        while (targetIndex < target.length()) {
        int sourceIndex = 0;
        int prevTargetIndex = targetIndex;

        while (sourceIndex < source.length() && targetIndex < target.length()) {
            if (source.charAt(sourceIndex) == target.charAt(targetIndex)) {
                sourceIndex++;
                targetIndex++;
            } else {
                sourceIndex++;
            }
        }

        if (prevTargetIndex == targetIndex) {
            // If targetIndex didn't change, it means no progress was made,
            // and we can't match the characters anymore.
            return -1;
        }

        result++;
    }

    return result;
    }

}