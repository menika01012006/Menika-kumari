
#include<iostream>
using namespace std;
class car{
    public:
    string name;
    int price;
    int seat;
    car( string n,int p,int s){
       name=n;
       price=p;
       seat= s;
    }
};
int main(){
    car c1( "Honda", 150000,5);
}