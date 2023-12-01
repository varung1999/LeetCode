class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        
        for(String x: word1){
            first.append(x);
        }
        
        for(String x: word2){
            second.append(x);
        }
        System.out.println(first+" "+second);
        return first.toString().equals(second.toString());
    }
}