package practice;

public class Pangram {

	public boolean checkIfPangram(String sentence) {
		
		int n = sentence.length();
		boolean check[] = new boolean[26];
		
		for(int i =0;i<n;i++)
		{
			int index = (int)( sentence.charAt(i)-97);
			check[index]=true;
		}
		
		for(boolean i:check)
		{
			if(i!=true)
			{
				return false;
			}
		}
		
		return true;
	}
	
	

	public static void main(String[] args) {
		String s = "thequickbrownfoxjumpsoverthelazydog";
		Pangram p = new Pangram();
		System.out.println(p.checkIfPangram(s));
	}

}
