#include <iostream>
using namespace std;
int fac(int n)
{
    int f = 1;
    for (int i = 2; i <=n; i++) {
        f = f*i;
    }
    return f;
}

int main() {
    int n;
    int ans;
    cin>>n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j<=i; j++) {
            ans=fac(i)/(fac(j)*fac(i-j));
            cout<<ans<<" ";
        }
        cout<<endl;
    }
	return 0;
}