class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Offer06{
    public static int[] reversePrint(ListNode head){
        ListNode currNode =head;
        int len=0;
        while (currNode!=null){//获取链表的长度
            len++;
            currNode=currNode.next;
        }
        int [] result =new int [len];//初始化数组
        currNode =head;
        while (currNode!=null){//将链表的数值倒序放入数组中
            result[len-1]=currNode.val;
            len--;
            currNode=currNode.next;
        }
        return result;
    }
    public static void main(String[] args) {
    //初始化链表
        ListNode head=new ListNode(1);
		    ListNode firstNode = new ListNode(3);
		    ListNode secondNode = new ListNode(2);
		    head.next=firstNode;
		    firstNode.next = secondNode;
    //打印链表
        for (int i=0;i<reversePrint(head).length;i++){
            System.out.println(reversePrint(head)[i]);
        }
    }
}
