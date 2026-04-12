
#include<iostream>
using namespace std;
class Student{
    public:
    string name;
    int roll;
    float gpa;
};
int main(){
    Student s;
    s.name="menika";
    s.roll=123;
    s.gpa=6.95;

    cout<<s.name<<endl<<s.roll<<endl<<s.gpa<<endl;

}