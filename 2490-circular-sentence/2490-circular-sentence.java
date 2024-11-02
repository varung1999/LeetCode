class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence == null || sentence.length() == 0)
            return false;

        String[] splitArray = sentence.split(" ");

        for(int i = 0;i<=splitArray.length-1;i++){
            String currString = splitArray[i];
            String nextString = splitArray[(i+1)%splitArray.length];
            
            if(currString.charAt(currString.length()-1) != nextString.charAt(0)) return false;
        }
        
        return true;
    }
}