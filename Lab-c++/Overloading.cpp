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
    cout<<name<<" is "<<age<<" years old "<<course<<" sub "; }
};

int main(){

Person prayas;
prayas.a("RAM",7);
prayas.a("SUYOG",90);
prayas.a("PRAYAS",9,"c++");
}

