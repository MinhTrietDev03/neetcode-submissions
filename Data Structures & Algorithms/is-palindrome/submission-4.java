class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length() -1;

        while(left < right){

            while(left < right && !Character.isLetterOrDigit(s.charAt(left)) ){
                left ++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }

            // chuyeern kis tu sang chu thuongw
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            // kieerm tra neeus ksi tu ben trai khac ki tu ben pahir thi sai
            if(leftChar != rightChar){
                return false;
            }
            // cho left sang tari va right sang phai
            left ++ ; 
            right --;
        }
        return true;
    }
}


//tao 2 pointer 
//Lăp cho 2 pointer đến nào hoan thanh fieu kien ben tỏng gặp nhau
//kierm tra dieu kien nếu gặp space hoặc digit thì bỏ qua
// kiểm tra chuển các kí tu thành chu thuognw
// kiểm tra nếu 2 2pointer khác nhau thì nó sẽ false
// cho 2 pointer duy chuyển lần lượt sang trai và pahir