#include <iostream>
using namespace std;


void swap(int *x, int *y){

    int temp = *x;
    *x = *y;
    *y = temp;
}

void print(int arr[], int size){

    for(int i=0; i<size; i++){
        cout << arr[i] << " ";
    }
    cout << endl;
}


void sort(int a[], int size){

    int min;

    for(int i=0; i<size-1; i++){
        min = i;
        for(int j=i+1; j<size; j++){
            if(a[j] > a[min]){
                min = j;
            }
            swap(&a[j], &a[min]);
        }
    }
}

int main(){

    int arr[] = {5, 1, 4, 2, 3};
    int size = sizeof(arr) / sizeof(arr[0]);
    print(arr, size);
    sort(arr, size);
    print(arr, size);
    return 0;
}

