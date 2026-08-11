class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()
        counter = 0
        for i in range(len(nums) - 1):
            if nums[i] == nums[i+1]:
                counter += 1
                if counter >= (len(nums)//2):
                    return nums[i]
            else:
                counter = 0
        return nums[0]

