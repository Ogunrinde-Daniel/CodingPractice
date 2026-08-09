class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int [nums1.length];

        int currentN = 0;
        int currentM = 0;
        int i = 0;
        for(; i < result.length; i++){
            if(currentM >= m || currentN >= n)
                break;
            if(nums1[currentN] < nums2[currentM]){
                result[i] = nums2[currentN];
                currentN++;
            }else{
                result[i] = nums1[currentM];
                currentM++;
            }
        }
        if(currentM < m){
            for(;i< result.length; i++){
                result[i] = nums1[currentM];
            }
        }
        if(currentN < n){
            for(;i< result.length; i++){
                result[i] = nums2[currentN];
            }
        }

        for(int j = 0; j < nums1.length;j++){
            nums1[j] = result[j];
        }
    }
}