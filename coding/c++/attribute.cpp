#include<iostream>
using namespace std;
class animals{
public:
string name, colour;
void eat(){
    cout<<"eating the mango "<<endl;

}    
};
class dog:public animals{
    public:
    void bark(){
        cout<<"banra"<<endl;

    }
};
class cat :public animals{
    public:
    void meow(){
        cout<<"bilara";
    }
};

int main()
{
    dog mydog;
    mydog.eat();
    mydog.bark();
    cout<<mydog.name<<" bandhar";
}

    



