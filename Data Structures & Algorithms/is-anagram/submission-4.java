class Solution {
    public boolean isAnagram(String s , String t){

        // kiểm tra độ dài s và t 
        if(s.length() != t.length()){
            return false;
        }

        //create arr
        int[] count = new int[26];

        for(int i=0; i< s.length() ; i++){
            
            //tăng so làn xuat hien
            count[s.charAt(i) -'a']++;

            // giam so làn xuat hien
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
