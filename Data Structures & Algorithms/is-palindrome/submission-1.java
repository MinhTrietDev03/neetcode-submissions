class Solution {
    public boolean isPalindrome(String s) {
        
        //tao 2 pointer 
        int left = 0; // tai vi tri index = 0 thif cos gia tri left

        int right= s.length() -1 ; // vi chuoi s cos 5 gia tri khi them vao mang pahir thi index bawts daafu tu so  0 nen phai -1 ddi

        // Loop 2 pointer khong gap nahu cho den khi hoan thanh ca dieu kien ben trong
        // giong nhu 2 nguoi ddi chua gao thi se di tiep cho den khi naof gapw
        while(left < right){
            
            // Loop trai  -> pahir neu gapw space or digit thif sex skip
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                //Duy chuyen left sang trai
                left ++ ;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                // duy chuyen tu pahi sang trai
                right --;
            } 

            //Chuyen kis tu sang thuong

            char leftChar  = Character.toLowerCase(s.charAt(left));

            char rightChar = Character.toLowerCase(s.charAt(right));

            //Kiem tra neu ky tu trai snag pahi va pahi sang trai neu khac nhau thi return false
            if(leftChar != rightChar){
                return false;
            }

            // duy chuyen snag trai vaf tu pahi snag trai
            left ++; 
            right --;
        }
        return true;
    }
}
