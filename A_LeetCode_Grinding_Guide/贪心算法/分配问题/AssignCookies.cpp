#include<iostream>
#include <algorithm>//使用sort要有这个头文件
#include<vector>//使用向量存储器要有这个头文件
using namespace std;
class AssignCookies {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.begin(),g.end());
        sort(s.begin(),s.end());
        int child=0,cookie=0;
        while(child<g.size() && cookie<s.size()){
            if (g[child]<=s[cookie]){
                child+=1;
            }
            cookie+=1;
        }
        return child;
    }
};

int main()
{
    AssignCookies result;
    //初始化向量存储器
    vector<int> g={1,2,3};
    vector<int> s={1,3};
    cout<<result.findContentChildren(g,s)<<endl;
    return 0;
};
