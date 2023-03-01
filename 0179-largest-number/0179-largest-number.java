class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length==0) return "";
        
        String[] val = new String[nums.length];
        for(int i = 0;i<nums.length;i++)
        {
            val[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(val, new Comparator<String>(){
            public int compare(String a, String b)
            {
                String s1 = a + b;
                String s2 = b + a;
                
                return s2.compareTo(s1);
            }
        });
        if(val[0].charAt(0)=='0') return "0";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<val.length;i++)
        {
            sb.append(val[i]);
        }
        
        return sb.toString();
    }
}