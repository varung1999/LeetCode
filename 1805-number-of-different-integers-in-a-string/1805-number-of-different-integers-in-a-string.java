class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();

        String temp = "";

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);

            if(c>='0'&&c<='9'){
                if(temp.equals("0")) temp = "";

                temp += c;
            }
            else if(temp.length()!=0){
                set.add(temp);
                temp = "";
            }
        }
            
            if(temp.length()!=0){
                set.add(temp);
                temp = "";
            }

        return set.size();
    }
}