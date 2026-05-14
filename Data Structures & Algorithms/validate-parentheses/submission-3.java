class Solution {
    public boolean isValid(String s) {
        // tạo một stack để lưu các phần tử
        Stack<Character> stack = new Stack<>();

        // duyệt qua các ký tự trong chuỗi s
        for(char c : s.toCharArray()){

            // kiểm tra các phần tử nếu là dấu ngoặc mở thì đưa cào stack
            if(c == '(' || c == '[' || c == '{'){

                //save in stack
                stack.push(c);

            }else{
                // nếu rỗng thì return false
                if(stack.isEmpty()){
                    return false;
                }

                //lấy phần tử cuối ra để kiểm tra cặp đúng
                //stack.pop lấy phần tử cuối ra 
                char top = stack.pop();

                if(
                    c == ')' && top != '(' ||
                    c == ']' && top != '[' ||
                    c == '}' && top != '{' 
                )
                // nếu nó khong đún cặp trả về false
                return false;
            }
        }
        // return về stack rỗng nếu cặp ngoặc lấy ra khỏi stack lấy ra đún với nhau
        return stack.isEmpty();
    }
}
