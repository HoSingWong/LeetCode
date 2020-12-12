#include<iostream>
#include<string>//用来定义字符串
using namespace std;
class Offer05 {
public:
    string replaceSpace(string s) {
        int count = 0;
        int len = s.size();
        // 统计空格数量
        for (char c : s) {
            if (c == ' ') count++;
        }
        // 修改 s 长度,腾出两个字符的空位插入原来的长度中
        s.resize(len + 2 * count);
        // 倒序遍历修改
        for(int i = len - 1, j = s.size() - 1; i < j; i--, j--) {
            if (s[i] != ' ')
                s[j] = s[i];
            else {
                s[j - 2] = '%';
                s[j - 1] = '2';
                s[j] = '0';
                j -= 2;
            }
        }
        return s;
    }
};
int main()
{
    Offer05 result;
    string s;
    s = "We are happy.";
    cout<<result.replaceSpace(s)<<endl;
    return 0;
}
