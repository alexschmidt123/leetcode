package q4;

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length - 1;
        int n = nums2.length - 1;
        int k = m + n + 1;
        int[] fnums = new int[m + n + 2];
        for (int i = 0; i < nums1.length; i++) {
            fnums[i] = nums1[i];
        }
        while (n >= 0) {
            if (m >= 0 && fnums[m] > nums2[n]) {
                fnums[k] = fnums[m];
                k--;
                m--;
            } else {
                fnums[k] = nums2[n];
                k--;
                n--;
            }
            System.out.println(Arrays.toString(fnums));
        }
        int len = fnums.length;
        if (len % 2 == 0) {
            Double res = Double.valueOf(fnums[len / 2] + fnums[len / 2 - 1]);
            return res / 2;
        } else {
            return fnums[(len - 1) / 2];
        }
    }
}