class Solution {
    public static String restoreString(String s, int[] indices) {
	     
		 
		 char[] sor = new char[indices.length];
		 
		 for(int i = 0;i<indices.length;i++)
		 {
			 sor[indices[i]] = s.charAt(i);
		 }
		 String ans = "";
		 for(int i = 0;i<sor.length;i++)
		 {
			 ans+=sor[i];
		 }
		 return ans;
		 
	    }
}
