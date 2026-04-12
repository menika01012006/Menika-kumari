
#include<iostream>
using namespace std;
class item{
    public:
    int number;
    float coast;
    void gatedata(int a,float b){
        number=a;
        coast=b;
    }

    void putdata(){
cout<<number<<coast<<endl;
    }
};
// void item:: gatedata(int a,float b){
//     number=a;
//     coast=b;
//}

int main(){
    item x,y;
    x.gatedata( 5,100);
    x.putdata();
    y.gatedata(100,10000.456);
    y.putdata();

}
    


