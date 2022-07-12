class Solution {
    public String[] reorderLogFiles(String[] logs) {
        if(logs == null || logs.length == 0) return new String[]{};
        
        Arrays.sort(logs,(log1,log2)->{
            
            String[] strArray1 = log1.split(" ",2);
            String[] strArray2 = log2.split(" ",2);
            boolean isDigit1 = Character.isDigit(log1.charAt(log1.length()-1));
            boolean isDigit2 = Character.isDigit(log2.charAt(log2.length()-1));
            
            if(!isDigit1 && !isDigit2)
            {
                int comp = strArray1[1].compareTo(strArray2[1]);
                if(comp == 0)
                {
                    return strArray1[0].compareTo(strArray2[0]);
                }
                return comp;
            }
            else if(!isDigit1 && isDigit2)
            {
                return -1;
            }
            else if(isDigit1 && !isDigit2)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        });
        
        return logs;
    }
}