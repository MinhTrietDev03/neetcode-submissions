class Solution {
    public boolean isAnagram(String s, String t) {
        //kiểm tra độ dài 2 chuỗ
        if(s.length() != t.length()){
            return false;
        }

        //create arr
        int[] count = new int[26];

        for(int i =0 ; i< s.length(); i++){

            // tắng số lần xuất hiện
            count[s.charAt(i)- 'a'] ++;
            count[t.charAt(i)- 'a' ]--;

        }

        for(int num : count){
            if(num != 0 ){
                return false;
            }
        }
        return true;
    }
}
