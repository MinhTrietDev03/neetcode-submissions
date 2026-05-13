class Solution {
    public boolean isPalindrome(String s) {
        
        // tạo một pointer bên trái
        int left = 0;

        // tạo một pinter bên pahir
        int right = s.length() -1 ;

        // Lặp cho 2 pointer chưa gặp nhau
        while (left < right){
            //Nếu kí tự bên trái không pahir là chữ or số
            //thi bỏ qua
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }

            // Neu ki tu ben pahi khong phai la chu hoac so 
            // thi bo qua
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }

            // Convert ly tu ben trai thanh lowcase (chữ thường)
            char leftChar = Character.toLowerCase(s.charAt(left));

            // Convert ki tu ben phai thanh Lowcase (chữ thường)
            char rightChar = Character.toLowerCase(s.charAt(right));

            // kiểm tra neeys khác nhau thì ra false
            if(leftChar != rightChar){
                
                return false;
            }

            // duy chuyển pointer sang bên trái
            left ++;

            //duy chuyển pointer sang bên phải
            right -- ;
        }

        // trả về nếu mismatch (ghép không đối xứng) => palidrome
        return true; 


    }
}
