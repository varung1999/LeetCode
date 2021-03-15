class Solution {
   public static String interpret(String command) {
		String ans = "";
		int i =0;
		while(i<command.length())
		{
			if(command.charAt(i)=='G')
			{
				ans+='G';
				
			}
			else if(command.charAt(i)=='('&& command.charAt(i+1)==')')
			{
				ans+='o';
				
			}
			else if(command.charAt(i)=='('&& command.charAt(i+1)=='a' && command.charAt(i+2)=='l' && command.charAt(i+3)==')')
			{
				ans+="al";
				
			}
			i++;
		}
		return ans;
	}

}
