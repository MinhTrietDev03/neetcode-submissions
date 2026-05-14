class Solution {
    public boolean isValid(String s) {
        //tạo một stack
        Stack<Character> stack =  new Stack<>();

        //duyệt từng kí tự trong chuỗi char c: s.toCharArray
        for(char c : s.toCharArray()){

            //Nếu là dấu ngoặc mở thì đưa vào stack
            if( c == '(' || c == '[' || c == '{'){
                
                // ddauw vào stack
                stack.push(c);
            }

            // nếu là đóng
            else{
                
                // nếu trỗng thì không có dấu ngoặc đóng
                if(stack.isEmpty()){
                    return false;
                }

                //Lấy dấu mở gần nhất ra
                // lấy phần tử cuối cùng ra khỏi stack
                char top = stack.pop() ;

                // kiêm tra phần tử vừa lấy ra có đúng vơi cặp đưa vào hay không
                if(
                    c == ')' && top != '(' ||
                    c == ']' && top != '[' ||
                    c == '}' && top != '{' 
                )

                return false;
            }
        }
        //sau khi kiểm tra xong nếu rỗng mới tồn tại
        return stack.isEmpty();
    }
}
