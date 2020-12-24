import java.util.Stack;
public class Offer30{
    Stack<Integer> A,B;
    /** initialize your data structure here. */
    public Offer30() {
        A = new Stack<> ();
        B = new Stack<> ();
    }
    
    public void push(int x) {
        A.add(x);
        if (B.isEmpty() || B.peek()>=x){
            B.add(x);
        }
    }
    
    public void pop() {
        if( A.pop().equals(B.peek())){
            B.pop();
        }
    }
    
    public int top() {
        return A.peek();
    }
    
    public int min() {
        return B.peek();
    }
    public static void main(String[] args) {
        Offer30 minStack = new Offer30();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int temp = minStack.min();
        System.out.println(temp);
        minStack.pop();
        int temp2 = minStack.top();
        System.out.println(temp2);
        int temp3 = minStack.min();
        System.out.println(temp3);
    }
}
