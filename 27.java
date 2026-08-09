class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int[] arr = new int[nums.length];

        for(int i =0; i< nums.length; i++){
            if(nums[i] != val){
                arr[counter] = nums[i];
                counter++;
                
            }
        }

        for(int i = 0; i< counter; i++){
            nums[i] = arr[i];
        }
        return counter;
    }
}