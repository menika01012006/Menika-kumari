
#include<iostream>
using namespace std;
int main(){
    int n, n1,n2 ,hcf=1;
    n=(n1<n2) ?n1:n2; 
    cout<<"enter n1";
    cin>>n1;
    cout<<" enter n2";
    cin>>n2;
     for( int i=1;i<=n;i+=5){
     if(n1%i==0 && n2%i==0)
     cout<<hcf;
cout<<endl;
    
}
}