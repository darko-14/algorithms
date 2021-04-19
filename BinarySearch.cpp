#include <iostream>
using namespace std;

int binarySearch(int arr[], int l, int r, int n){
   if(r >= 1){
      int mid = l + (r-l) / 2;
      if(arr[mid]==n){
         return mid;   
      }
      if(arr[mid] > n){
         return binarySearch(arr, l, mid-1, n);
      }

      return binarySearch(arr, mid+1, r, n);
   }
   return -1;
}


int main(){
   int array[] = {99, 55, 31, 25, 13, 95, 93, 88};
   int size = sizeof(array)/sizeof(array[0]);
   int num = 25;
   int result = binarySearch(array, 0, size-1, num);
   (result == -1) ? cout << "No such element in the array" : cout << "Element found on index: " << result; 
}