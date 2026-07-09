// Last updated: 7/9/2026, 3:05:31 PM
class Solution {
    public int distanceTraveled(int mT, int aT) {
        int total=0;
        while(mT>=5){
            total+=50;
            mT-=5;
            if(aT>=1){
                mT++;
                aT--;
            }
        }
        return total+(mT*10);
    }
}