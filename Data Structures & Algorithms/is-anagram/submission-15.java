class Solution {
    public boolean isAnagram(String s, String t) {

        // keiemr tra độ dài của 2 chuỗi
        if(s.length() != t.length()){
            return false;
        }

        //creta arr count
        int[] count = new int[26];

        //loop and up inscrease
        for(int i = 0 ; i < s.length(); i++){
            
            count[s.charAt(i)- 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int num : count){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
