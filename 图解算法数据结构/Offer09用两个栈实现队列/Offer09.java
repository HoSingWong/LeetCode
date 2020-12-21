import java.util.LinkedList;
public class Offer09{
    LinkedList<Integer> A;
    LinkedList<Integer> B;
    public Offer09() {
        A =new LinkedList<Integer>();
        B =new LinkedList<Integer>();
    }
    
    public  void appendTail(int value) {
         A.addLast(value);
    }
    
    public  int deleteHead() {
        if(!B.isEmpty()){
            return B.removeLast();
        }
        if (A.isEmpty()){
            return -1;
        }
        while(!A.isEmpty()){
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
    public static void main(String[] args) {
        Offer09 obj = new Offer09();
        obj.appendTail(1);
        obj.appendTail(2);
        obj.appendTail(3);
        int param_2 = obj.deleteHead();
        System.out.println(param_2);
    }
}
