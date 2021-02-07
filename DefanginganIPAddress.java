class Solution {
    public static String defangIPaddr(String address) {
         int n = address.length();
		 String ans = address.substring(0,1);
		 int startIndex = 0;
		 int endIndex = 0;
		 String finalans="";
		 for(int i = startIndex;i<n;i++)
		 {
			 if(address.charAt(i)=='.')
			 {
				 endIndex = i;
				 ans += address.substring(startIndex,endIndex)+"[.]";
				 
			 }
			 
			 startIndex = endIndex+1;
		 }
		 finalans=ans+address.substring(endIndex+1,n);
		 return finalans;
	 }
    }
