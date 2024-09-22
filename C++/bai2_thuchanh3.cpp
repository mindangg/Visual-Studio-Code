#include <iostream>
using namespace std;
void swap(char &a, char &b)
{
	char t = a; a = b; b = t;
}

int main(int argc, char **argv)
{
    int a[100], n = 1;
    for(int i = 1; i < argc; i++)
    {
        int t = atoi(argv[i]);
        if(isdigit(t))
        {
            a[i] = t;
            n++;
        }
    }  

	for(int i = 1; i < n; i++)
        for(int j = i + 1; j <= n; j++)
            if(a[i] > a[j])
                swap(a[i], a[j]);

	cout<<"Day tang dan la: "<<n;
	for(int i = 1; i < n; i++)
		cout<<a[i]<<" ";
    
    return 0 ;
}