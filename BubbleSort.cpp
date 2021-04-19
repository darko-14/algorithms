#include <iostream>
using namespace std;



void swap(int *x, int *y){
    int temp = *x;
    *x = *y;
    *y = temp;
}

void sort(int arr[], int size){

    for(int i=0; i<size-1; i++){
        for(int j=0; j<size-i-1; j++){
            if(arr[j] > arr[j+1]){
                swap(&arr[j], &arr[j+1]);
            }
        }
    }
}

void print(int arr[], int size){

    cout << endl;
    for(int i=0; i<size; i++){
        cout << arr[i] << " ";
    }
    cout << endl;
}


int main(){

    int array[] = {11, 5, 1, 9, 7, 2};
    int size = sizeof(array) / sizeof(array[0]);
    print(array, size);
    sort(array, size);
    print(array, size);
}
