import java.util.*;
class Solution {
    public static boolean isPalindrome(int x)
	{
		String inp = String.valueOf(x);
		
		
		String ans = reverse(inp);
		
		int i =0;
		int j =0;
		
		
		while(i<inp.length() && j<ans.length())
		{
			if(inp.charAt(i)!=ans.charAt(j))
			{
				return false;
			}
			i++;
			j++;
		}
		return true;
	}
	
	public static String reverse(String inp)
	{
		String output = "";
		while(!inp.isEmpty())
		{
			output+=inp.charAt(inp.length()-1);
			inp=inp.substring(0, inp.length()-1);
		}
		return output;
	}
}
