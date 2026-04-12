
#include<iostream>
#include<cmath>
using namespace std;
void power(int a,int b){
    if(b==0||b==1)return 1;
    return b*log(a);

}
int main(){
    int a,b;
    cout<<"enter the value";
    cin>>a>>b;
    cout<<power(a,b);
}