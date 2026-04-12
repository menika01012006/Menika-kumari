
#include<iostream>
#include<cmath>
using namespace std;

class circle{
    public:
    int r;
    float area,circumferance;
    circle  (){
        
       // area=3.14*r*r;
        cout<<"radius";
        cin>>r;
        area=3.14*r*r;
        //cout<<"area"<<area<<endl;
    }
    
    
};

int main(){
    circle c1;
    c1.area;
            cout<<"area"<< c1.area<<endl;

    
}