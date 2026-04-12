



  #include<iostream> 
using namespace std;
int main(){
int n;
//int m;
cout<<"enter n";
cin>>n;
//cout<<"enter m";
//4cin>>m;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
{cout<<" ";}
for(int j=1;j<=2*i-1;j++)
{cout<<"j";}

cout<<endl;
}
};

