#include<iostream>
using namespace std;
int main(){
int age;
string Nationality;
cout<<"Enter the age:";
cin>>age;
cout<<"Enter the Nationality:";
cin>>Nationality;
if(age<18){
    cout<<"Voting is not eligible due to age\n ";}
    
    else if(age<18 && Nationality != "Nepali")
	{
    cout<<"voting is not eligible due to both";
	}

else if(age>18 && Nationality == "Nepali" || Nationality == "Other")
    {
    cout<<"voting is eligible\n";
    }
    else
    {
    cout<<"voting is not eligible due to nationality\n";
    }


}
