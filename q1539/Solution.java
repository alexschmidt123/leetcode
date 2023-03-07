package q1539;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        if (arr[0]-k-1>=0) {return k;}
        int num = 0;
        int interval = 0;
        for (int i=0; i<arr.length; i++){
            int temp = interval;
            interval = arr[i] -i -1;
            if (interval<k){
                num = i;
            }else{
                interval = temp;
                break;
            }          
        }
        return arr[num]+k-interval;
    } 
}