
class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 0;
        int[] arr = new int[nums.length];
        if(arr.length > 0){
            arr[0] = nums[0];
            counter++;
        }
        for(int i = 1; i< nums.length; i++){
            if(nums[i] != arr[counter-1]){
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
