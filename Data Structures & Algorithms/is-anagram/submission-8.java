class Solution {
    public boolean isAnagram(String s, String t) {

        //kiểm tra độ dài 2 chuoi 
        if(s.length() != t.length()){
            return false;
        }

        //tạo một mảng 26 kí tự
        int[] count = new int[26];

        //duyệt tât cả các phần tư và tăng, giảm số lần xuất hiện 
        for(int i=0; i <  s.length() ; i++){

            // tăng số lần xuất hiên
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i)- 'a']--;
        }

        for(int num : count){
            if( num != 0){
                return false;
            }
        }
        return true;
    }
}
