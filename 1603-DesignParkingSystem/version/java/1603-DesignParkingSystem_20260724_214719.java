// Last updated: 7/24/2026, 9:47:19 PM
1class ParkingSystem {
2
3    int[] slots;
4
5    public ParkingSystem(int big, int medium, int small) {
6        slots = new int[4];
7        slots[1] = big;
8        slots[2] = medium;
9        slots[3] = small;
10    }
11
12    public boolean addCar(int carType) {
13        if (slots[carType] > 0) {
14            slots[carType]--;
15            return true;
16        }
17        return false;
18    }
19}
20
21/**
22 * Your ParkingSystem object will be instantiated and called as such:
23 * ParkingSystem obj = new ParkingSystem(big, medium, small);
24 * boolean param_1 = obj.addCar(carType);
25 */