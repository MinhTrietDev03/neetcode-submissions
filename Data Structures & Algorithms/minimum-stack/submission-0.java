class MinStack {

    //create stack and minstack
    private Stack<Integer> stack;

    private Stack<Integer> minStack;

    //Create two stack null
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        
    }
    
    //add one val in stack
    public void push(int val) {
        stack.push(val);
        //if Stack null , val is  first minVal
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            //get minVal current
            int currentMin = minStack.peek();
            //So sánh val với giá trị nhỏ nhất trươc sdod
            int newMin = Math.min(val,currentMin);
            //Save val với giá trị nhở nhất trước đó
            minStack.push(newMin);

        }
    }
    
    //xóa phần tử trên đỉnh Stack
    public void pop() {
        stack.pop();
        //xóa giá trị nhỏ nhất tương ứng với tầng vừa xóa
        minStack.pop();
    }
    

    // lấy phần tử trên đinh Stack mà không xóa
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
