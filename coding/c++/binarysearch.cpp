#include <iostream>
using namespace std;
int main()
{
    int n, item;
    cout << "enter the n" << endl;
    cin >> n;
    int a[n];
    cout << "enter the array" << endl;
    int start = 0;
    int end = n-1 ;
    int mid;
    int found = -1;

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    cout << "the array is" << endl;
    for (int i = 0; i < n; i++)
    {
        cout << a[i] << endl;
    }
    cout << " binary search" << endl;

    cout << "enter item" << endl;
    cin >> item;
    while (start <= end)
    {
        mid = (start + end) / 2;
        

        if (a[mid] == item)
        {
            found = mid;
            break;
        }
        else if (a[mid] < item)
        {
            end = mid - 1;
        }
        else
        {
            start = mid + 1;
        }
    }
    if (found != -1)
    {
        cout << "element  found" << mid << endl;
    }
    else
    {
        cout << "not found" << endl;
        return 0;
    }
}