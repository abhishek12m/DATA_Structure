#include <iostream>
using namespace std;
int main(){
    int a=2;
    while(a--){
        cout<<"a";
    }
}
/*class Solution {
public:
    vector<int> sortArrayByParityII(vector<int>& nums) {
        int t=0;
        int n=sizeof(nums)/sizeof(nums[0]);
        for (int i=0;i<n;i++){
            if ((nums[i]%2)==0){
                if ((i%2)==0){
                    t=nums[i];
                    nums[i]=t;
                }else{
                    t=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=t;
                }
            }
            else{
                if ((i%2)!=0){
                   t=nums[i];
                   nums[i]=t;
                }
                else{
                    t=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=t;
                }
            }
        }
        return nums;
    }
};*/
