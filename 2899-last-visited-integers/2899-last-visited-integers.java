class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> num=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        int c=0;
        for(int i=0;i<words.size();i++)
        {
           if(words.get(i).equals("prev"))
           {
               if (c < num.size())
               {
                   res.add(num.get(num.size()-1-c));
               }
                else
                {
                res.add(-1);
                }
               c++;
           }
                else {
                     int nums = Integer.valueOf(words.get(i));
                    num.add(nums);
                        c = 0;
                    }           
            
        }
        return res;
    }
}
