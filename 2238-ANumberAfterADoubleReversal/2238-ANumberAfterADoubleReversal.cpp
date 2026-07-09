// Last updated: 7/9/2026, 3:06:03 PM
class Solution {
public:
    bool isSameAfterReversals(int num) {
      
        if(num ==0 || !(num%10==0)){
         return true;   
        }else{
            return false;
        }
    }
};