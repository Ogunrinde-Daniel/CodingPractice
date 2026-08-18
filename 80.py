from typing import List


class Solution:
    def betterSolution(self, nums: List[int]) -> int:
        write = 0
        for num in nums:
            if write < 2 or num != nums[write - 2]:
                nums[write] = num
                write += 1
        return write        

    def removeDuplicates(self, nums: List[int]) -> int:
        negSize = 0
        count  = 1
        i = 1

        while i < len(nums) - negSize:
            if nums[i] == nums[i-1]:
                count += 1
                if count > 2:
                    for j in range(i, len(nums)-1):
                        nums[j] = nums[j+1]
                    negSize += 1
                    nums[len(nums)-negSize] = -1
                    continue
            else:
                count = 1
            i += 1

        return len(nums) - negSize

    def test_against_expected(self, nums: list, expected: list, test_id: int = None) -> bool:

        arr = list(nums)
        k = self.removeDuplicates(arr)
        result = arr[:k]
        tid = f"{test_id}" if test_id is not None else "?"
        print(f"Test {tid}:")
        print(f" Input:    {nums}")
        print(f" Output:   (k={k}) {result}")
        print(f" Expected: (k={len(expected)}) {expected}")
        if k == len(expected) and result == expected:
            print(f" Result:   correct\n")
            return True
        else:
            print(f" Result:   wrong\n")
            return False


def main():
    sol = Solution()
    tests = [
        ([1, 1, 1, 2, 2, 3], [1, 1, 2, 2, 3]),
        ([0, 0, 1, 1, 1, 1, 2, 3, 3], [0, 0, 1, 1, 2, 3, 3]),
    ]
    for idx, (nums, expected) in enumerate(tests, start=1):
        sol.test_against_expected(nums, expected, idx)


if __name__ == "__main__":
    main()
