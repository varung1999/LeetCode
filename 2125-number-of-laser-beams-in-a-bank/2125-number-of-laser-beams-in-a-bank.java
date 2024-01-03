class Solution {
    public int numberOfBeams(String[] bank) {
        if(bank == null || bank.length == 0) return 0;
        
        int[] devices = new int[bank.length];
        int i = 0;
        for(String x : bank)
        {
            for(char c:x.toCharArray())
            {
                if(c=='1')
                {
                    devices[i]++;
                }
            }
            i++;
        }
        
        int num = 0,res = 0;
        for(int j=0;j<devices.length;j++)
        {
            if(devices[j]!=0)
            {
                if(num == 0)
                {
                    num = devices[j];
                }
                else{
                    num*=devices[j];
                    res+=num;
                    num = devices[j];
                }
            }
        }
        
        return res;
    }
}