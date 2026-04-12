
#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    float s1,s2,s3,area,s;
    cout<<"entre s1";
    cin>>s1;
    cout<<"entre s2";
    cin>>s2;
    cout<<"entre s3";
    cin>>s3;
    s=(s1+s2+s3)/2;
    area=sqrt( s*(s-s1)*(s-s2)*(s-s3));
    cout<<"area"<<endl<<area;
}