#include <iostream>

using namespace std;

int main()
{
    string s1,s2;
    cin>> s1>> s2;
    if(s1==s2){
        cout<<"0";
    }
    else{
        if(s1<s2){
                cout<<"-1";
        }
        else if(s1>s2){
                cout<<"1";
        }
    }
    return 0;
}
#include <iostream>

using namespace std;

int main()
{
    string s1,s2;
    int c1=0,c2=0;
    cin>> s1>> s2;
    if(s1.length()==s2.length()){
            if(s1==s2){
                cout<<'0'<<endl;
            }
    else{
        for(int i=0;i<s1.length();i++){
            if (s1[i]>s2[i]){
                cout<<'1'<<endl;

            }
            else if(s1[i]<s2[i])
                {
                    cout<<'-1'<<endl;

                    }
                    else{
                        cout<<'0'<<endl;
                    }
    }
    }
    }
    return 0;
}
#include <iostream>

using namespace std;

int main()
{
    string s;
    cin>>s;
    int c1=0,c2=0,c=0;
    for (int i=0;i<s.length();i++){
        if(s[i]=='1'){
            c1++;
        }
        else if(s[i]=='2'){
            c2++;
        }
        else if(s[i]=='3') {
            c++;
        }
    }
    while(c1){
            cout<<'1';

            if(c1!=0){
                cout<<'+';
                c1--;
            }
    }
    while(c2){
            cout<<'2';

            if(c2!=0){
                break;
                cout<<'+';
                c2--;
            }
    }
    while(c){
            cout<<'3';
            c--;
            if(c!=0){
                cout<<'+';
            }
    }
    return 0;
}
#include <iostream>

using namespace std;

int main()
{
    string s;
    cin>>s;
    int c1=0,c2=0,c=0;
    for (int i=0;i<s.length();i++){
        if(s[i]=='1'){
            c1++;
        }
        else if(s[i]=='2'){
            c2++;
        }
        else if(s[i]=='3') {
            c++;
        }
    }
    while(c1--){
            cout<<'1'<<'+';
    }
    while(c2--){
            cout<<'2'<<'+';
    }
   while(c--){
            cout<<'3'<<'+';
    }
    return 0;
}

