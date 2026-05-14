class Solution {
    public boolean isAnagram(String s, String t) {

        // kiem tra do dai 2 mang neu khong dun thi not anargram
        if(s.length() != t.length() ){
            return false;
        }

        //tao arr để luu thư tu xuat hien
        int[] count = new int[26];

        // duet qua tung tung phan tu kieem tra thu tu xuat hien
        for(int i =0 ; i < s.length() ; i++){

            //tang so làn xuat hien

            count[s.charAt(i) - 'a']++;

            // giam so lan xuat hien
            count[t.charAt(i) - 'a']--;
        }

        // duyet qua count kierm tra xem có bang 0 hay khong
        for(int num : count){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}
