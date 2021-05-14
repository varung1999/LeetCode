package practice;

public class StudentAttendance {

	public static boolean checkRecord(String s) {
		
		boolean check = checkforA(s);
		if(check==false)
		{
			return false;
		}
		String k = "LLL";
		if(s.contains(k)) {
			return false;
		}
		return true;
	}
	
	public static boolean checkforA(String s)
	{
		int cA = 0;
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)=='A')
			{
				cA++;
			}
		}
		
		if(cA>=2)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static void main(String[] args) {
		String s = "PPALLP";
		System.out.println(checkRecord(s));
	}

}
