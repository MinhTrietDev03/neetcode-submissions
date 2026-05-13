class Solution {
    public boolean isAnagram(String s, String t) {

        //Neu do dai khac nhau thi khong la anagram
        if(s.length() != t.length() ){
            return false;
        }

        //Create array 
        int[] count = new int[26];
        
        //Duyet qua toan bo mang
        for(int i = 0 ; i <s.length(); i++){

            //lay ky tu ben s -> tang so lan xuat hien
            count[s.charAt(i) - 'a']++;

            //lay ky tu ben t -> giam so lan xuat hien
            count[t.charAt(i) - 'a']--;

        }
         //Kiem tra toan bo mang Count
            for(int num : count){
                if(num != 0){
                    return false;

                }
            }
            return true;
    }
}
