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
    int n,r;
    int ans;
    cin>>n>>r;
    ans=fac(n)/(fac(r)*fac(n-r));
	cout<<ans<<endl;
	return 0;
}