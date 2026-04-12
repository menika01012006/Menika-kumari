
#include<iostream>
using namespace std;
void hello(){
    cout<<" welcome to c++ programming"<<endl;
}
int multiply(int a,int b){
    return a*b;
}
int main()
{
    hello();
    int result=multiply(4,5);
    cout<<"multi result"<<result<<endl;
    return 0;
}