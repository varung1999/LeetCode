class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary, new Comparator<String>(){
            public int compare(String s1, String s2)
            {
                return s2.length()!=s1.length()?s2.length()-s1.length() : s1.compareTo(s2);
            }
        });
        
        for(String str: dictionary)
        {
            if(isSub(str,s)) return str;
        }
        
        return "";
    }
    
    private boolean isSub(String str, String s)
    {
        int j = 0;
        for(int i =0;i<s.length() && j<str.length();i++)
        {
            if(str.charAt(j)==s.charAt(i)) j++;
        }
        
        return j == str.length();
    }
}