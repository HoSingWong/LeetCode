#include<iostream>
#include<string>
using namespace std;
class Solution {
public:
    int strToInt(string str) {
        int k=0;
        while(str[k]==' ') ++k;//找到第一个非空格字符
        int res = 0, flag = 1;//res记录结果的值，flag记录符号位
        if(str[k]=='-') flag=-1;//如果第一个字符是-号，则符号位为-1
        if(str[k]=='-' || str[k]=='+') ++k;//如果第一个字符是符号位，则从下一个字符开始遍历寻找最长数字串
        while(k<str.size() && isdigit(str[k]))//当k未到达字符串末尾并且当前字符是数字时
        {
            int r = str[k] - '0';//记录当前数字
            if(res>INT_MAX/10 || (INT_MAX/10==res && r>7))//判断当前结果是否溢出,溢出直接返回最大值或者最小值
                return flag==1?INT_MAX:INT_MIN;
            res =res*10+r;//累加当前数字，末尾多一位数字等价将原来数字*10再加上所加的数字即可
            ++k;
        }
        return res*flag;
    }
};

int main()
{
    Solution sol;
    string s1="42";
    cout<<sol.strToInt(s1)<<endl;
    string s2="-42";
    cout<<sol.strToInt(s2)<<endl;
    return 0;
}
