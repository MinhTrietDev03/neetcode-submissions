class Solution {
    public boolean isValid(String s) {
        
        // tạo 1 stack để lưu dấu mở đầu
        Stack<Character> stack =  new Stack<>();

        // duỵet tưng ký tu trong chuoi s 

        for(char c: s.toCharArray()){
            
            //Nếu là dấu mở 
            if(c == '(' || c == '[' || c == '{' ){
                
                //đưa dấu mở vào stack
                stack.push(c);
            }

            // Nếu là dấu đóng
            else{

                //Nếu là stack rỗng
                if(stack.isEmpty()){
                    return false;
                }

                // lấy dấu mở gần nhất ra

                char top = stack.pop();

                //Kiem tra co dung cap khong
                if( 
                    (c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '{' && top != '{') 
                ){
                    return false; // sai cặp
                }
            }
        }
        // sau khi duyệt xong thì stack pahir rỗng mới hợp lệ
        return stack.isEmpty();

    }
}


// có 3 hộp A , b,c
// Nhiệm vụ cần đóng hộp C trước
// không thể đóng b trước C

//Stack: là Dsa hoạt động theo cấu trúc Last in first out
//vào sau ra trước
// phần tử gần nhất cần được xử lí trước
//push là thêm phần tử vào đỉnh stack 
//pop là lấy phần tử trên cùng ra khỏi stack
//peek/top là xem phần tử trên cùng
//isEmpty() xem phần tử này có trỗng hay khong