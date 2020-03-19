/*Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]*/

public int[] swapEnds(int[] nums) {
  int extra[] = new int[1];
  extra[0] = nums[0];
  nums[0]= nums[nums.length-1];
  nums[nums.length-1]= extra[0];
  return nums;
}