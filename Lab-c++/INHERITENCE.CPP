#include<iostream>
using namespace std;
class Person{
    public:
    string name;
    int age;
    void a(string s, int a){
    name = s;
    age = a;
    cout<<name<<" is "<<age<<"  years old "<<"\n";
    }

    void a (string s , int a , string c){
    name = s;
    age = a;
    string course=c;
    cout<<name<<" is "<<age<<" years old "<<course <<"\n";
     }
};
class Student: public Person{
public:
    void display(){
    cout<<"HELLO";
    }
};

int main(){
Student s;
s.a("RAM",20,"BSC.CSIT");
s.a("PRAYAS",78);
}



