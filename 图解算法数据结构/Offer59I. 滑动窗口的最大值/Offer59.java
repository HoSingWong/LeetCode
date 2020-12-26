import java.util.LinkedList;
import java.util.Deque;
public class Offer59{
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length==0 || k==0){
            return new int[0];
        }
        Deque<Integer> deque=new LinkedList();
        int[] res=new int[nums.length-k+1];
        for (int i=1-k,j=0;j<nums.length;i++,j++){
            if(i>0 && deque.peekFirst()==nums[i-1]){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && deque.peekLast()<nums[j]){
                deque.removeLast();
            }
            deque.add(nums[j]);
            if(i>=0){
                res[i]=deque.peekFirst();
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums=new int[] {1,3,-1,-3,5,3,6,7};
        int k = 3;
        for(int i=0;i<maxSlidingWindow(nums,k).length;i++){
            System.out.println(maxSlidingWindow(nums,k)[i]);
        }
        
    }
}
