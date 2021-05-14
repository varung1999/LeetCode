package practice;

public class TwoArraysEquivalent {

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		
		String str1="";
		String str2="";
		
		StringBuffer a = new StringBuffer();
		StringBuffer b = new StringBuffer();
		for(int i =0;i<word1.length;i++)
		{
			a.append(word1[i]);
		}
		
		str1 = a.toString();
		
		for(int i=0;i<word2.length;i++)
		{
			b.append(word2[i]);
		}
		str2=b.toString();
		if(str1.equals(str2))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String a[] = {"abc", "d", "defg"};
		String b[] = {"abcddefg"};
		
		boolean ans = arrayStringsAreEqual(a, b);
		System.out.println(ans);
		
		
	}

}
