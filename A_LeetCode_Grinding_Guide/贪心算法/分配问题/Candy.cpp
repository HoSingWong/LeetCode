#include<iostream>
#include<vector>
using namespace std;
class Candy {
public:
    int candy(vector<int>& ratings) {
        int size=ratings.size();
        if (size<2){
            return size;
        }
        vector<int> num(size,1);
        int sum=0;
        for (int i=1;i<size;i++){
            if(ratings[i]>ratings[i-1]){
                num[i]=num[i-1]+1;
            }
        }
        for (int i=size-1;i>0;i--){
            if(ratings[i]<ratings[i-1]){
                num[i-1]=max(num[i-1],num[i]+1);
            }
        }
        for (int n:num){
            sum+=n;
        }
        return sum;
    }
};
int main(){
    Candy result;
    vector<int> ratings={1,0,2};
    cout<<result.candy(ratings)<<endl;
}
