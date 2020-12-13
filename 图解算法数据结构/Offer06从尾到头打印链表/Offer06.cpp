#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
struct ListNode {
    int val;//当前结点的值
    ListNode *next;//指向下一个结点的指针
    ListNode(int x) : val(x), next(NULL) {}//初始化当前结点值为x,指针为空
 };

class Offer06 {
public:
    vector<int> reversePrint(ListNode* head) {
        vector<int> res;//初始化向量存储容器res
        while (head){
            res.push_back(head->val);//在res数组的最后添加一个数据
            head = head->next;//链表指向下一个
        }
        reverse(res.begin(), res.end());//反转顺序
        return res;
    }
};

int main()
{
    ListNode* head=new ListNode(1);
    ListNode* firstNode=new ListNode(3);
    ListNode* secondNode=new ListNode(2);
    head->next=firstNode;
    firstNode->next=secondNode;

    //head->val=1;
    //head->next=firstNode;
    
    //firstNode->val=3;
    //firstNode->next=secondNode;
    
    //secondNode->val=2;
    Offer06 sol;
    for (int i=0;i<sol.reversePrint(head).size();i++){
        cout<<sol.reversePrint(head)[i]<<endl;
    }
    
    return 0;
}
