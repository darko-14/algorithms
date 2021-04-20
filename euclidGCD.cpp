#include <iostream>
using namespace std;

int gcd(int x, int y){

   int r = x % y;
   if(r == 0){
      return y;
   }
   return gcd(y, r);
}


int main(){
   cout << gcd(1112, 695);
}