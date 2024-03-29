package q875;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1; //left
        int r = piles[0];  //right, initial value is the max element in the array
        for(int i = 0;i<piles.length;i++){
            r=Math.max(r,piles[i]);
        }
        
        int m;  // middle   
        int ans = -1;
        while(l<=r){
            m = (l+r)/2; 
            if(check(piles, h,m)){
                r = m-1;
                ans = m;
            }else{
                l = m+1;
            }
        }
        return ans;
    }

    public boolean check(int[] piles, int h, int k){
        if(k ==0)return false;
        int i = 0;
        while(h>=0 && i<piles.length){

            h -=Math.ceil((double)piles[i]/k);
            i++;
        }
        return (h>=0 && i == piles.length);
    }
}






















// class Solution {
//     public int minEatingSpeed(int[] piles, int h) {
//         Arrays.sort(piles); 
//         int res =0 ;
//         for  (int k = piles[piles.length-1];k>=1; k--){
//             int totalHour = 0;
//             for (int i = 0; i<piles.length; i++){
//                 float x = (float)piles[i]/k; 
//                 totalHour += Math.ceil(x);
//             }
//             if (totalHour>h){
//                 break;
//             }
//             res = k;
//         }
//         return res;
//     }
// }