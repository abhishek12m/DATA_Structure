#include <iostream>
using namespace std;
void fac(int n)
{
    int f = 1;
    for (int i = 1; i <=n; i++) {
        f = f*i;
    }
    cout<<f<<endl;
}

int main() {
    int n;
    cin>>n;
    fac(n);
	return 0;
}