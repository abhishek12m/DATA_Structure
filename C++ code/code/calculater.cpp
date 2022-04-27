#include<iostream>

using namespace std;

int main()
{
    char op;
    cout<<"enter a operator: "<<endl;
    cin>>op;
    float n1,n2;
    cout<<"enter 2 number: "<<endl;
    cin>>n1>>n2;
    switch(op)
    {
    case '+':
        cout<<n1+n2<<endl;
        break;
    case '-':
        cout<<n1-n2<<endl;
        break;
    case '*':
        cout<<n1*n2<<endl;
        break;
    case '/':
        cout<<n1/n2<<endl;
        break;
    default:
        cout<<"enter another operator: ";
        break;
    }
	return 0;
}