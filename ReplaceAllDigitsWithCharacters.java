package practice;

public class ReplaceAll {

	public static String replaceDigits(String s) {
		char arr[] = s.toCharArray();
		
		for(int i = 1;i<arr.length;i+=2)
		{
			arr[i]= (char)(arr[i-1]+Character.getNumericValue(arr[i]));
		}
		
		return new String(arr);
		
	}

	public static void main(String[] args) {
		String s = "a1c1e1";
		System.out.println(replaceDigits(s));

		
		

	}

}
