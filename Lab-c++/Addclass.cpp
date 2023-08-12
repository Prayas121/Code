#include<iostream>
using namespace std;
class Add{
	public:
		int result = 0;
		int a;
		int b;
		int num1 = a;
		int num2 = b;
		void n (int a , int b){
			result = a+b;
				cout<<result;
		}
		
	
};

int main(){
	Add t;
	t.n(5,7);
}
