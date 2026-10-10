class MinStack {

    //create two stack
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    //Cho 2 stack null
    public MinStack() {
        stack= new Stack<>();
        minStack = new Stack<>();
    }
    
    //add val in Stack
    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            int currentMin = minStack.peek();
            //so sánh giá tị hiện tại với giá trị nhỏ nhất trước đó
            int newMin = Math.min(val,currentMin);
            //save val với giá trị nhỏ nhất
            minStack.push(newMin); 
        }
        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
        
        
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
