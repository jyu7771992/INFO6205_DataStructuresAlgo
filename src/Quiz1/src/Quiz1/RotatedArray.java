package Quiz1;
//Rotated Array
//Given an array, rotate the array to the right by k steps, where k is non-negative.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//Example 2:
//
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation:
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]
class Solution1{
    public void rotate(int[] nums, int k) {
        k %= nums.length; //get k to find the head of LinkedList
        int tempNode, prevNode; // define the tempNode & prevNode
        for (int i = 0; i < k; i++) {
            prevNode = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                tempNode = nums[j];
                nums[j] = prevNode;
                prevNode = tempNode;
            }
        }
    }
}

