class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Offer06:
    def reversePrint(self, head: ListNode)-> list:
        res = []#初始化数组
        while head:#只要链表不为空就循环
            res.append(head.val)#将链表的值添加进数组中
            head = head.next#将链表指向下一位
        return res[::-1]#将数组倒序

result=Offer06()
#初始化链表
head=ListNode(1)
firstNode=ListNode(3)
secondNode=ListNode(2)
head.next=firstNode
firstNode.next = secondNode
#打印链表
for i in range(len(result.reversePrint(head))):
    print(result.reversePrint(head)[i])