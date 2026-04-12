
  #include<iostream> 
using namespace std;
int main(){
int n;
int m;
cout<<"enter n";
cin>>n;
cout<<"enter m";
cin>>m;
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++)
if( i%2==0)
cout<<(char)(j+64);
else
cout<<j;}

};

