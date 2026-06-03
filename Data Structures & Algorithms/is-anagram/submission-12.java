class Solution {
    public boolean isAnagram(String s, String t) {

        //kiểm tra đọ dài của 2 chuỗi
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0 ; i< s.length(); i++){
            
            // tăng số lần xuất hiện
            count[s.charAt(i)- 'a']++;
            //giảm sso lần xuất hiện
            count[t.charAt(i)- 'a']--;
        }

        for(int num : count){
            if(num != 0){
                return false;
            }
        }
        return true;
        
    }
}

//Kiểm tra độ dìa 2 chuỗi
//tạo một mảnh \
//loop các phàn tử và tăng giảm so lần xuat hien
//num != 0 thì flase
// return true