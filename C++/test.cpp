#include <iostream>
using namespace std;
int tong(int n)
{
    int s = 0;
    for(int i = 1;i <= n; i++)
        s += i;
    return s;
}

int main(int argc, char **argv)
{
    if(argc > 2)
        cout<<"Co qua nhieu doi so"<<endl;
    else
    {
        int t;
        for(int i = 1; i < argc; i++)
        {
            t = atoi(argv[i]);
            if(t <= 0)
            {
                cout<<"Doi so khong phai so nguyen duong"<<endl;
                return 0;
            }
        }
        cout<<"Tong S = "<<tong(t)<<endl;
    }
    return 0;
}