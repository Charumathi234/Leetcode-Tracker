// Last updated: 7/24/2026, 10:08:35 PM
1class Solution {
2    public int reversePairs(int[] nums) {
3        return mergeSort(nums, 0, nums.length - 1);
4    }
5
6    private int mergeSort(int[] nums, int left, int right) {
7        if (left >= right) return 0;
8
9        int mid = left + (right - left) / 2;
10        int count = mergeSort(nums, left, mid)
11                  + mergeSort(nums, mid + 1, right);
12
13        int j = mid + 1;
14        for (int i = left; i <= mid; i++) {
15            while (j <= right && (long) nums[i] > 2L * nums[j]) {
16                j++;
17            }
18            count += j - (mid + 1);
19        }
20
21        merge(nums, left, mid, right);
22        return count;
23    }
24
25    private void merge(int[] nums, int left, int mid, int right) {
26        int[] temp = new int[right - left + 1];
27        int i = left, j = mid + 1, k = 0;
28
29        while (i <= mid && j <= right) {
30            if (nums[i] <= nums[j]) {
31                temp[k++] = nums[i++];
32            } else {
33                temp[k++] = nums[j++];
34            }
35        }
36
37        while (i <= mid) {
38            temp[k++] = nums[i++];
39        }
40
41        while (j <= right) {
42            temp[k++] = nums[j++];
43        }
44
45        System.arraycopy(temp, 0, nums, left, temp.length);
46    }
47}