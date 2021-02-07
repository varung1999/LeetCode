
public class SplitString {

	public static int balancedStringSplit(String s) {
		int rcount = 0;

		int fcount=0;

		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)=='R')
			{
				rcount++;
			}
			else
				rcount--;
			if(rcount == 0 )
			{
				fcount++;
			}
		}
		return fcount;
	}
	public static void main(String[] args) {		
		String s = "LLLLRRRR"; //RLLLLRRRLR
		System.out.println(balancedStringSplit(s));
	}
}
