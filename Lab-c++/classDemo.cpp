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
};

int main(){

Person prayas;
prayas.a("RAM",7);
prayas.a("Suyog",90);

}
