#include <iostream>
using namespace std;
class Car{
    public: int price;
    public: string color;
    void run()
    {
        cout<<"Car is running";
    }
};

int main()
{
    Car car1;
    car1.price = 10;
    car1.color = "red";
    cout<<car1.price<<" "<<car1.color;
    car1.run();
}