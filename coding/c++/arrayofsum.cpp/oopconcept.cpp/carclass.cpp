
#include<iostream>
using namespace std;
    class car{
        public:
        string name;
        int price;
        int seat;
        string type;
    };
    int main()
    {
        car c1;
        c1.name="honda";
        c1.price=150000;
        c1.seat=34;
        c1.type="sedan";

        cout<<c1.name<<endl<<c1.price<<" "<<c1.seat<<" "<<c1.type;
    }


    
