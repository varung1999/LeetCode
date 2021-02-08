class Solution {
    public static boolean rotateString(String A, String B) {
		int alen = A.length();
		boolean ans = false;
    if(A.length()==0 && B.length()==0 )
    {
        return true;
    }
		
		int i = 0;
		while(i<alen)
		{
			char first = A.charAt(0);
			A=A.substring(1);
			A+=first;
			if(A.equals(B))
			{
				ans = true;
				return ans;
			}
			
			else
			{
				i++;
			}
		}
		
		return ans;
		
	}
}
