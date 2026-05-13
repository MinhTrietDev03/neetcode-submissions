class Solution {
    public boolean isAnagram(String s, String t) {

        //Neu do dai khac nhau => khong phai anagram
        if(s.length() != t.length()){
            return false;
        }

        //tao mang 26 phan tu tu a - z
        int[] count = new int[26];

        //duyet tung ky tu
        for(int i = 0 ; i< s.length(); i ++){

            //lay ky tu ben s
            // tang so lan xuat hien
            count[s.charAt(i) - 'a']++;

            //lay ky tu ben t
            //giam so lan xuaat hien
            count[t.charAt(i) - 'a']--;
        }

        //Kiem tra toan bo count
        for (int num : count){
            
            //Neu khac 0 thi so lan xuat hien khac nhau
            //So lan xuat hienj khong giong nhau
            if(num != 0 ){
                return false;
            }
        }
        return true; 


    }
}
