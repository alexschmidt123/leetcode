package q88;
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int begin = 0;
    int address = m;
    for (int i = 0; i < n; i++) {
      nums1[m+i] = nums2[i];
      address = m+i;
      for (int j = m - 1+i; j >= begin; j--) {
        if (nums1[address] < nums1[j]) {
          int temp = nums1[j];
          nums1[j] = nums1[address];
          nums1[address]=temp;
          address = j;
        }     
      }
      begin = address;
    }
  }
}

