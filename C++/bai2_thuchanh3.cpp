#include <iostream>
using namespace std;
void swap(int &a, int &b)
{
	int t = a; a = b; b = t;
}

int main(int argc, char **argv)
{
    int a[100], n = 0, t;
    for(int i = 1; i < argc; i++)
    {
        t = atoi(argv[i]);
        if(t != 0)
        {
            a[n] = t;
            n++;
        }
    }  

	for(int i = 0; i < n - 1; i++)
        for(int j = i + 1; j < n; j++)
            if(a[i] > a[j])
                swap(a[i], a[j]);

	cout<<"Day tang dan la: ";
	for(int i = 0; i < n; i++)
		cout<<a[i]<<" ";
    
    return 0 ;
}