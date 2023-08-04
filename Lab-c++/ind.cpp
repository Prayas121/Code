#include <iostream>
using namespace std;

int main() {
    int num;
    int originalnum;
    cout << "Enter the number: ";
    cin >> num;

    while (num > 0) {
        int digit = num % 10;
        
        num /= 10;
        cout << digit<<"\n";
    }

    return 0;
}

