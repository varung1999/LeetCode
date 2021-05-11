package practice;
import java.util.*;

public class StringMatching {

	public static List<String> stringMatching(String[] words) {
		ArrayList<String> ans = new ArrayList<>();

		int n = words.length;
		for(int i =0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(words[i].contains(words[j]) )
				{
					if(!ans.contains(words[j])) {
						ans.add(words[j]);
					}
				}
			}
		}

		for(int i =0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(words[j].contains(words[i]) )
				{
					if(!ans.contains(words[i])) {
						ans.add(words[i]);
					}
				}
			}
		}


		return ans;
	}

	public static void main(String[] args) {
		String words1[]= {"leetcode","et","code"};
		List<String> ans = stringMatching(words1);


		for(String i:ans)
		{
			System.out.print(i+" ");
		}

	}

}
