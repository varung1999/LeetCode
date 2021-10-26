class Solution {
    public int expressiveWords(String s, String[] words) {
        
        int final_count = 0;
        
        for(String str: words)
        {
            if(check(s,str))
            {
                final_count++;
            }
        }
        
        return final_count;
        
    }
    
    
    public static boolean check(String s, String w)
    {
        if(s.equals(w))
        {
            return true;
        }
        
        if(s.length()==0 || w.length()==0 || w.length()>s.length())
        {
            return false;
        }
        
        int s_index = 0, w_index = 0;
        
        while(s_index<s.length() && w_index<w.length())
        {
            char s_char = s.charAt(s_index);
            char w_char = w.charAt(w_index);
            
            if(s_char!=w_char)
            {
                return false;
            }
            
            int s_char_count = 0;
            
            while(s_index < s.length() && s.charAt(s_index)==s_char)
            {
                s_char_count++;
                s_index++;
            }
            
            int w_count =0;
            
            while(w_index < w.length() && w.charAt(w_index) == w_char)
            {
                w_count++;
                w_index++;
            }
            
            if((w_count > s_char_count) || (s_char_count > w_count && s_char_count < 3))
            {
                return false;
            }
        }
        
        return s_index == s.length() && w_index == w.length();
    }
}
